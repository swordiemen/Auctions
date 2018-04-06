
/**
 * AuctionServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.example.www.auction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
     *  AuctionServiceSkeleton java skeleton for the axisService
     */
    public class AuctionServiceSkeleton implements AuctionServiceSkeletonInterface{
        
        private int idGen = 0;
    	private Set<AuctionItem_type0> items = new HashSet<>();
    	private Map<Integer, Bid> bids = new HashMap<>();

    	/**
    	 * Auto generated method signature
    	 * 
    	 * @param bid3
    	 * @return param4
    	 * @throws BidItemFault
    	 */
    	
    	public AuctionServiceSkeleton() {
    		load();
    		checkAuctionDates();
    	}

    	private void checkAuctionDates() {
    		Calendar twoMonthCheck = Calendar.getInstance();
    		Calendar currentDate = Calendar.getInstance();
    		int curMonth = twoMonthCheck.get(Calendar.MONTH);
    		twoMonthCheck.add(Calendar.MONTH, 2); // Pretty sure this also takes into account overflow (and deals with it as well)
    		List<AuctionItem_type0> toRemove = new ArrayList<>();
    		List<AuctionItem_type0> overDate = new ArrayList<>();
    		for(AuctionItem_type0 au : getItems()) {
    			Calendar end = au.getEndTime();
    			if(end.compareTo(twoMonthCheck) > 0) {
    				toRemove.add(au);
    			} else if(end.compareTo(currentDate) > 0) {
    				overDate.add(au);
    			}
    		}
    		getItems().removeAll(toRemove);
    		for(AuctionItem_type0 remove : toRemove) {
    			getBids().remove(remove);
    		}
    		handleOverdateBids(overDate);
    	}
    	
    	public void save() {
    		try(ObjectOutputStream oosItems = new ObjectOutputStream(new FileOutputStream(new File("items.obj"))); 
    				) {
    			oosItems.writeObject(getItems());
    		} catch (FileNotFoundException e) {
    			// this is okay, means that it simply hasn't been saved before
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		try(ObjectOutputStream oosBids = new ObjectOutputStream(new FileOutputStream(new File("bids.obj")))) {
    			oosBids.writeObject(getBids());
    		} catch (FileNotFoundException e) {
    			// this is okay, means that it simply hasn't been saved before
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	
    	public void load() {
    		try(ObjectInputStream oosItems = new ObjectInputStream(new FileInputStream(new File("items.obj"))); 
    				ObjectInputStream oosBids = new ObjectInputStream(new FileInputStream(new File("bids.obj")))) {
    			this.items = (Set<AuctionItem_type0>) oosItems.readObject();
    			this.bids = (Map<Integer, Bid>) oosBids.readObject();
    		} catch (FileNotFoundException e) {
    			// this is okay, means that it simply hasn't been saved before
    		} catch (IOException | ClassNotFoundException e) {
    			e.printStackTrace();
    		}
    	}

    	public void bidItem(org.example.www.auction.Bid bid3) throws BidItemFault {
    		checkAuctionDates();
    		int id= bid3.getAuctionID();
    		Bid currentBid = getBids().get(id);
    		AuctionItem_type0 ai = getItemByID(id);
    		if(currentBid == null && !getItems().contains(bid3.getAuctionID())) {
    			throw new BidItemFault("The bid's AuctionItem does not exist.");
    		} else if(currentBid != null && ai.hasExpired()) {
    			throw new BidItemFault("The auction has expired.");
    		} else if(bid3.getBidAmount() < ai.getMinimumBid()) {
    			throw new BidItemFault("The bid amount is not higher than the minimum bid.");
    		} else if(currentBid != null && bid3.getBidAmount() <= currentBid.getBidAmount()) {
    			throw new BidItemFault("New bid is not higher than the previous bid.");
    		} else {
    			getBids().put(id, bid3);
    			save();
    		}
    	}
    	
    	public AuctionItem_type0 getItemByID(int id) {
    		return getItems().stream().filter(item -> item.getId() == id).findFirst().orElse(null);
    	}
    	
    	public Map<Integer, Bid> getBids() {
    		return bids;
    	}
    	
    	public Set<AuctionItem_type0> getItems() {
    		return items;
    	}

    	/**
    	 * Auto generated method signature
    	 * 
    	 * @param auctionItem2
    	 * @return param3
    	 * @throws AddAuctionFault
    	 */

    	public AuctionID addAuction(org.example.www.auction.AuctionItem auctionItem) throws AddAuctionFault {
    		checkAuctionDates();
    		if (items.stream()
    				.anyMatch(au -> au.getItemName().equals(auctionItem.getAuctionItem().getItemName())
    						&& au.getItemOwnerName().equals(auctionItem.getAuctionItem().getItemOwnerName()))) {
    			throw new AddAuctionFault("Auction item already exists!");
    		} else {
    			auctionItem.getAuctionItem().setId(idGen++);
    			items.add(auctionItem.getAuctionItem());
    			save();
        		AuctionID response = new AuctionID();
        		response.setAuctionID(auctionItem.getAuctionItem().getId());
        		return response;
    		}

    	}

    	/**
    	 * Auto generated method signature
    	 * 
    	 * @return itemList5
    	 * @throws GetAllAuctionItemsFault
    	 */

    	public org.example.www.auction.ItemList getAllAuctionItems(

    	) throws GetAllAuctionItemsFault {
    		checkAuctionDates();
    		ItemList il = new ItemList();
    		items.stream().forEach(au -> {
    			il.addAuctionItem(au);
    		});
    		return il;
    	}

    	public void clear() {
    		getBids().clear();
    		getItems().clear();
    	}
    	
    	public void handleOverdateBids(List<AuctionItem_type0> overDate) {
    		// TODO send it to the orchestrator
    	}

     
    }
    