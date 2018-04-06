
/**
 * AuctionServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.example.www.auction;
    /**
     *  AuctionServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface AuctionServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param bid
             * @throws BidItemFault : 
         */

        
                public void bidItem
                (
                  org.example.www.auction.Bid bid
                 )
            throws BidItemFault;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param auctionItem
             * @throws AddAuctionFault : 
         */

        
                public org.example.www.auction.AuctionID addAuction
                (
                  org.example.www.auction.AuctionItem auctionItem
                 )
            throws AddAuctionFault;
        
         
        /**
         * Auto generated method signature
         * 
             * @throws GetAllAuctionItemsFault : 
         */

        
                public org.example.www.auction.ItemList getAllAuctionItems
                (
                  
                 )
            throws GetAllAuctionItemsFault;
        
         }
    