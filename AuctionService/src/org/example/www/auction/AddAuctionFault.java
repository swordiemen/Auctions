
/**
 * AddAuctionFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.example.www.auction;

public class AddAuctionFault extends java.lang.Exception{

    private static final long serialVersionUID = 1522974921271L;
    
    private org.example.www.auction.AuctionFault faultMessage;

    
        public AddAuctionFault() {
            super("AddAuctionFault");
        }

        public AddAuctionFault(java.lang.String s) {
           super(s);
        }

        public AddAuctionFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AddAuctionFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.auction.AuctionFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.auction.AuctionFault getFaultMessage(){
       return faultMessage;
    }
}
    