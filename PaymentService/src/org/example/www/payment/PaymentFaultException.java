
/**
 * PaymentFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.example.www.payment;

public class PaymentFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1521646772549L;
    
    private org.example.www.payment.PaymentFault faultMessage;

    
        public PaymentFaultException() {
            super("PaymentFaultException");
        }

        public PaymentFaultException(java.lang.String s) {
           super(s);
        }

        public PaymentFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PaymentFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.payment.PaymentFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.payment.PaymentFault getFaultMessage(){
       return faultMessage;
    }
}
    