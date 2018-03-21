
/**
 * UserFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.example.www.user;

public class UserFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1519642503974L;
    
    private org.example.www.user.UserFault faultMessage;

    
        public UserFaultException() {
            super("UserFaultException");
        }

        public UserFaultException(java.lang.String s) {
           super(s);
        }

        public UserFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UserFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.user.UserFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.user.UserFault getFaultMessage(){
       return faultMessage;
    }
}
    