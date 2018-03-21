
/**
 * UserServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.example.www.user;
    /**
     *  UserServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface UserServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUserInfo
             * @throws UserFaultException : 
         */

        
                public com.example.www.user.getuserinfo.GetUserInfoResponse getUserInfo
                (
                  org.example.www.user.GetUserInfo getUserInfo
                 )
            throws UserFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addUser
             * @throws UserFaultException : 
         */

        
                public org.example.www.user.AddUserResponse addUser
                (
                  org.example.www.user.AddUser addUser
                 )
            throws UserFaultException;
        
         }
    