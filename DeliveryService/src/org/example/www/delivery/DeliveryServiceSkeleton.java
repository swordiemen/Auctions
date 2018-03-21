
/**
 * DeliveryServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.example.www.delivery;

import java.util.Random;

/**
 * DeliveryServiceSkeleton java skeleton for the axisService
 */
public class DeliveryServiceSkeleton implements DeliveryServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param createShipment0
	 * @return createShipmentResponse1
	 * @throws DeliveryFaultException
	 */

	public org.example.www.delivery.CreateShipmentResponse createShipment(
			org.example.www.delivery.CreateShipment shipment) throws DeliveryFaultException {
		// TODO : fill this with the necessary business logic

		// Send shipment request to parcel company
		System.out.println("Shipment request send to DHL" + "; pick up address:" + shipment.getSender().getAddress()
				+ "; delivery address:" + shipment.getReceiver().getAddress());

		Runnable myRunnable = new Runnable() {

			public void run() {
				try {
					// wait for reply
					Random rand = new Random();
					Thread.sleep((rand.nextInt(12) + 4) * 1000);

					// Email both users about the details.
					System.out.println("Email to sender [" + shipment.getSender().getPersonEmail() + "]: The auction item " + shipment.getAuctionItem().getItemName() + " will be picked up tomorrow between 10:00 and 13:00");
					System.out.println("Email to receiver [" + shipment.getReceiver().getPersonEmail() + "]: ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(myRunnable);
		thread.start();

		return new CreateShipmentResponse();
	}

}
