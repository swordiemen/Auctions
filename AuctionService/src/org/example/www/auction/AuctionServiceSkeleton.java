
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * AuctionServiceSkeleton java skeleton for the axisService
 */
public class AuctionServiceSkeleton implements AuctionServiceSkeletonInterface {

	private Set<AuctionItem_type0> items = new HashSet<>();
	private Map<AuctionItem_type0, Bid> bids = new HashMap<>();

	/**
	 * Auto generated method signature
	 * 
	 * @param bid3
	 * @return param4
	 * @throws BidItemFault
	 */
	
	public AuctionServiceSkeleton() {
		load();
	}
	
	public void save() {
		try(ObjectOutputStream oosItems = new ObjectOutputStream(new FileOutputStream(new File("items.obj"))); 
				ObjectOutputStream oosBids = new ObjectOutputStream(new FileOutputStream(new File("bids.obj")))) {
			oosItems.writeObject(getItems());
			oosBids.writeObject(getBids());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		try(ObjectInputStream oosItems = new ObjectInputStream(new FileInputStream(new File("items.obj"))); 
				ObjectInputStream oosBids = new ObjectInputStream(new FileInputStream(new File("bids.obj")))) {
			this.items = (Set<AuctionItem_type0>) oosItems.readObject();
			this.bids = (Map<AuctionItem_type0, Bid>) oosBids.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void bidItem(org.example.www.auction.Bid bid3) throws BidItemFault {
		AuctionItem_type0 ai = bid3.getAuctionItem();
		Bid currentBid = getBids().get(ai);
		if(currentBid == null && !getItems().contains(bid3.getAuctionItem())) {
			throw new BidItemFault("The bid's AuctionItem does not exist!");
		} else if(bid3.getBidAmount() > bid3.getBidAmount()) {
			throw new BidItemFault("Current bid is higher than the given bid!");
		} else {
			getBids().put(ai, bid3);
			save();
		}
	}
	
	public Map<AuctionItem_type0, Bid> getBids() {
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

	public void addAuction(org.example.www.auction.AuctionItem auctionItem) throws AddAuctionFault {
		if (items.stream()
				.anyMatch(au -> au.getItemName().equals(auctionItem.getAuctionItem().getItemName())
						&& au.getItemOwnerName().equals(auctionItem.getAuctionItem().getItemOwnerName()))) {
			throw new AddAuctionFault("Auction item already exists!");
		} else {
			items.add(auctionItem.getAuctionItem());
			save();
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
		ItemList il = new ItemList();
		items.stream().forEach(au -> {
			il.addAuctionItem(au);
		});
		return il;
	}

}
