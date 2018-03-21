
/**
 * DeliveryFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.example.www.delivery;

public class DeliveryFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1521659605655L;
    
    private org.example.www.delivery.DeliveryFault faultMessage;

    
        public DeliveryFaultException() {
            super("DeliveryFaultException");
        }

        public DeliveryFaultException(java.lang.String s) {
           super(s);
        }

        public DeliveryFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DeliveryFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.delivery.DeliveryFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.delivery.DeliveryFault getFaultMessage(){
       return faultMessage;
    }
}
    