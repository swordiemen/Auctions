
/**
 * BidItemFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.example.www.auction;

public class BidItemFault extends java.lang.Exception{

    private static final long serialVersionUID = 1522974921251L;
    
    private org.example.www.auction.AuctionFault faultMessage;

    
        public BidItemFault() {
            super("BidItemFault");
        }

        public BidItemFault(java.lang.String s) {
           super(s);
        }

        public BidItemFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BidItemFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.auction.AuctionFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.auction.AuctionFault getFaultMessage(){
       return faultMessage;
    }
}
    