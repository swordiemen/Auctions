
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package org.example.www.payment;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/Payment/".equals(namespaceURI) &&
                  "Payment".equals(typeName)){
                   
                            return  org.example.www.payment.Payment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/schema".equals(namespaceURI) &&
                  "AuctionItem".equals(typeName)){
                   
                            return  org.example.www.schema.AuctionItem.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    