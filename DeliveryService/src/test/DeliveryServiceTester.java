package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;

import org.example.www.delivery.CreateShipment;
import org.example.www.delivery.CreateShipmentResponse;
import org.example.www.delivery.DeliveryFaultException;
import org.example.www.delivery.DeliveryServiceSkeleton;
import org.example.www.delivery.ShipmentLocation;
import org.example.www.schema.AuctionItem;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DeliveryServiceTester {
	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private DeliveryServiceSkeleton service;
	
	@BeforeClass
	public static void init() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Before
	public void before() {
		service = new DeliveryServiceSkeleton();
	}

	@Test
	public void testValidCreateShipment() {

		AuctionItem auctionItem = new AuctionItem();
		auctionItem.setItemName("clock");
		auctionItem.setDescription("A clock from 1970.");
		auctionItem.setItemOwnerName("Tim");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		auctionItem.setEndTime(c);
		auctionItem.setMinimumBid(10);
		
		ShipmentLocation senderStop = new ShipmentLocation();
		senderStop.setPersonName("Tim");
		senderStop.setPersonEmail("tim@tom.nl");
		senderStop.setAddress("Amsterdam");
		
		ShipmentLocation receiverStop = new ShipmentLocation();
		receiverStop.setPersonName("freek");
		receiverStop.setPersonEmail("freek@vonk.nl");
		receiverStop.setAddress("Rotterdam");

		CreateShipment shipment = new CreateShipment();
		shipment.setAuctionItem(auctionItem);
		shipment.setSender(senderStop);
		shipment.setReceiver(receiverStop);
		
		try {			
			CreateShipmentResponse responce = service.createShipment(shipment);
			
			Thread.sleep(15*1000);
			
			String console = outContent.toString();
			
			assertTrue(console.contains("Email to sender"));
			assertTrue(console.contains("Email to receiver"));
			
		} catch (DeliveryFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
