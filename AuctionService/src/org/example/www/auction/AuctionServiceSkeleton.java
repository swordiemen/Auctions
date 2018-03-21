
/**
 * AuctionServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.example.www.auction;

import java.util.HashSet;
import java.util.Set;

/**
 * AuctionServiceSkeleton java skeleton for the axisService
 */
public class AuctionServiceSkeleton implements AuctionServiceSkeletonInterface {

private Set<AuctionItem> items = new HashSet<>();
	/**
	 * Auto generated method signature
	 * 
	 * @param bid3
	 * @return param4
	 * @throws BidItemFault
	 */

	public void bidItem(org.example.www.auction.Bid bid3) throws BidItemFault {
		// TODO : fill this with the necessary business logic

	}

	
	/**
	 * Auto generated method signature
	 * 
	 * @param auctionItem2
	 * @return param3
	 * @throws AddAuctionFault
	 */

	public void addAuction(org.example.www.auction.AuctionItem auctionItem) throws AddAuctionFault {
		if(items.stream().anyMatch(au -> au.getAuctionItem().getItemName().equals(auctionItem.getAuctionItem().getItemName()))) {
			throw new AddAuctionFault("Auction item already exists!");
		} else {
			items.add(auctionItem);
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
		// TODO : fill this with the necessary business logic
		ItemList il = new ItemList();
		items.stream().forEach(au -> {
			il.addAuctionItem(au.getAuctionItem());
		});
		return il;
	}

}
