package test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;

import org.example.www.payment.CreateDebtorPayment;
import org.example.www.payment.Payment;
import org.example.www.payment.PaymentFaultException;
import org.example.www.payment.PaymentServiceSkeleton;
import org.example.www.schema.AuctionItem;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaymentServiceTester {
	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private PaymentServiceSkeleton service;
	private static AuctionItem auctionItem;
	
	@BeforeClass
	public static void init() {
		System.setOut(new PrintStream(outContent));
		
		auctionItem = new AuctionItem();
		auctionItem.setItemName("clock");
		auctionItem.setDescription("A clock from 1970.");
		auctionItem.setItemOwnerName("Tim");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		auctionItem.setEndTime(c);
		auctionItem.setMinimumBid(10);
	}

	@Before
	public void before() {
		service = new PaymentServiceSkeleton();
	}
	
	@Test
	public void testValidCreateDebtorPayment() {
		Payment payment = new Payment();
		payment.setAmount(92.23);
		payment.setAuctionItem(auctionItem);
		payment.setDebtorEmail("freek@vonk.nl");
		payment.setDebtorName("Freek");
		
		CreateDebtorPayment paymentMessage = new CreateDebtorPayment();
		paymentMessage.setPayment(payment);
		
		try {
			service.createDebtorPayment(paymentMessage);
			
			Thread.sleep(15*1000);
			
			String console = outContent.toString();
			
			assertTrue(console.contains("Email to"));
			assertTrue(console.contains("Call callback at orchestrator"));
			
		} catch (PaymentFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
