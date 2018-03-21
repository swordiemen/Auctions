package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.example.www.auction.AddAuctionFault;
import org.example.www.auction.AuctionItem;
import org.example.www.auction.AuctionItem_type0;
import org.example.www.auction.AuctionServiceSkeleton;
import org.example.www.auction.Bid;
import org.example.www.auction.BidItemFault;
import org.example.www.auction.GetAllAuctionItemsFault;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sun.util.resources.CalendarData;

public class AuctionServerTester {

	private AuctionServiceSkeleton service;

	private static AuctionItem_type0 auType;
	private static AuctionItem_type0 auType2;
	private static AuctionItem_type0 auType3;
	
	
	@BeforeClass
	public static void init() {
		auType = new AuctionItem_type0();
		auType.setItemName("clock");
		auType.setDescription("A clock from 1970.");
		auType.setItemOwnerName("Tim");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		auType.setEndTime(c);
		auType.setMinimumBid(10);
		auType2 = auType.deepCopy();
		auType2.setItemName("Bench");
		auType3 = auType.deepCopy();
		auType3.setItemOwnerName("Huibert");
	}
	
	@Before
	public void before() {
		service = new AuctionServiceSkeleton();
		service.clear();
	}
	
	@Test
	public void testValidAddAndGetAuction() {
		AuctionItem input = new AuctionItem();
		AuctionItem input2 = new AuctionItem();
		AuctionItem input3 = new AuctionItem();
		input.setAuctionItem(auType);
		input2.setAuctionItem(auType2);
		input3.setAuctionItem(auType3);
		
		try {
			service.addAuction(input);
			service.addAuction(input2);
			service.addAuction(input3);
		} catch (AddAuctionFault e) {
			e.printStackTrace();
		}
		List<AuctionItem_type0> items = new ArrayList<>();
		try {
			for(AuctionItem_type0 au : service.getAllAuctionItems().getAuctionItem()) {
				items.add(au);
			}
		} catch (GetAllAuctionItemsFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(items.contains(auType));
		assertTrue(items.contains(auType2));
		assertTrue(items.contains(auType3));
	}
	
	@Test(expected = AddAuctionFault.class)
	public void testInvalidAddAuction() throws AddAuctionFault {
		AuctionItem input = new AuctionItem();
		input.setAuctionItem(auType);
		service.addAuction(input);
		service.addAuction(input);
	}
	
	@Test
	public void testBid() {
		AuctionItem input = new AuctionItem();
		input.setAuctionItem(auType);
		try {
			service.addAuction(input);
		} catch (AddAuctionFault e) {
			e.printStackTrace();
		}
		Bid bid = new Bid();
		bid.setAuctionItem(auType);
		bid.setBidAmount(15);
		try {
			service.bidItem(bid);
		} catch (BidItemFault e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(expected = BidItemFault.class)
	public void testInvalidBidNoAuction() throws BidItemFault {
		AuctionItem input = new AuctionItem();
		input.setAuctionItem(auType);
		try {
			service.addAuction(input);
		} catch (AddAuctionFault e) {
			e.printStackTrace();
		}
		Bid bid = new Bid();
		bid.setAuctionItem(auType2);
		bid.setBidAmount(15);
		service.bidItem(bid);
		
	}
	
	@Test(expected = BidItemFault.class)
	public void testInvalidBidBelowMinBid() throws BidItemFault {
		AuctionItem input = new AuctionItem();
		input.setAuctionItem(auType);
		try {
			service.addAuction(input);
		} catch (AddAuctionFault e) {
			e.printStackTrace();
		}
		Bid bid = new Bid();
		bid.setAuctionItem(auType);
		bid.setBidAmount(5);
		service.bidItem(bid);
		
	}
	
	@Test(expected = BidItemFault.class)
	public void testInvalidBidBelowMaxBid() throws BidItemFault {
		AuctionItem input = new AuctionItem();
		input.setAuctionItem(auType);
		try {
			service.addAuction(input);
		} catch (AddAuctionFault e) {
			e.printStackTrace();
		}
		Bid bid = new Bid();
		bid.setAuctionItem(auType);
		bid.setBidAmount(15);
		service.bidItem(bid);
		Bid invalidBid = new Bid();
		invalidBid.setAuctionItem(auType);
		invalidBid.setBidAmount(12);
		service.bidItem(invalidBid);
	}
	
	@Test
	public void testSaveLoad() {
		
	}
}
