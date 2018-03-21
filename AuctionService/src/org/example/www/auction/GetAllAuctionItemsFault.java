
/**
 * GetAllAuctionItemsFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.example.www.auction;

public class GetAllAuctionItemsFault extends java.lang.Exception{

    private static final long serialVersionUID = 1519649518358L;
    
    private org.example.www.auction.AuctionFault faultMessage;

    
        public GetAllAuctionItemsFault() {
            super("GetAllAuctionItemsFault");
        }

        public GetAllAuctionItemsFault(java.lang.String s) {
           super(s);
        }

        public GetAllAuctionItemsFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GetAllAuctionItemsFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.auction.AuctionFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.auction.AuctionFault getFaultMessage(){
       return faultMessage;
    }
}
    