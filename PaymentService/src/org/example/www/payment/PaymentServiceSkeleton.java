
/**
 * PaymentServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.example.www.payment;

import java.util.Random;

/**
 * PaymentServiceSkeleton java skeleton for the axisService
 */
public class PaymentServiceSkeleton implements PaymentServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param createDebtorPayment0
	 * @return createDebtorPaymentResponse1
	 * @throws PaymentFaultException
	 */

	public org.example.www.payment.CreateDebtorPaymentResponse createDebtorPayment(
			org.example.www.payment.CreateDebtorPayment createDebtorPayment) throws PaymentFaultException {
		// TODO : fill this with the necessary business logic

		// Add payment to financial system
		System.out.println(
				"Payment of €" + createDebtorPayment.getPayment().getAmount() + " added to the financial system");

		// Email debtor with a payment request
		System.out.println("Email to " + createDebtorPayment.getPayment().getDebtorEmail() + "; Dear "
				+ createDebtorPayment.getPayment().getDebtorName() + " please pay €"
				+ createDebtorPayment.getPayment().getAmount() + " for the item: "
				+ createDebtorPayment.getPayment().getAuctionItem().getDescription());

		Runnable myRunnable = new Runnable() {

			public void run() {
				try {
					// Wait a random number of seconds in the range of 3-15 seconds
					Random rand = new Random();
					Thread.sleep((rand.nextInt(12) + 4) * 1000);

					// Call the orchestrator callback indicating that the payment has been received
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(myRunnable);
		thread.start();

		return new CreateDebtorPaymentResponse();
	}

}
