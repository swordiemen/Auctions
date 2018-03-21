
/**
 * UserServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.example.www.user;

import com.example.www.user.getuserinfo.GetUserInfoResponse;

/**
 * UserServiceSkeleton java skeleton for the axisService
 */
public class UserServiceSkeleton implements UserServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param getUserInfo0
	 * @return getUserInfoResponse1
	 * @throws UserFaultException
	 */

	public com.example.www.user.getuserinfo.GetUserInfoResponse getUserInfo(
			org.example.www.user.GetUserInfo getUserInfo0) throws UserFaultException {
		
		if(getUserInfo0.getUsername().equals("admin")) {
			GetUserInfoResponse aur = new GetUserInfoResponse();
			aur.setAddress("adminlaan 2000");
			aur.setEmail("admin@admin.admin");
			return aur;
		} else {
			throw new UserFaultException("Unkown username.");
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addUser2
	 * @return addUserResponse3
	 * @throws UserFaultException
	 */

	public org.example.www.user.AddUserResponse addUser(org.example.www.user.AddUser addUser2)
			throws UserFaultException {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#addUser");
	}

}
