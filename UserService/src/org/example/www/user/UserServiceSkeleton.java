
/**
 * UserServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.example.www.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.example.www.user.getuserinfo.GetUserInfoResponse;

/**
 * UserServiceSkeleton java skeleton for the axisService
 */
public class UserServiceSkeleton implements UserServiceSkeletonInterface {
	
	public List<AddUser> users = new ArrayList<>();
	
	public UserServiceSkeleton() {
		load();
	}
	
	public void save() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("users.obj")))) {
			oos.writeObject(getUsers());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File("users.obj")))) {
			this.users = (List<AddUser>) oos.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getUserInfo0
	 * @return getUserInfoResponse1
	 * @throws UserFaultException
	 */

	public com.example.www.user.getuserinfo.GetUserInfoResponse getUserInfo(
			org.example.www.user.GetUserInfo getUserInfo0) throws UserFaultException {
		AddUser user = getUserByName(getUserInfo0.getUsername());
		if (user != null) {
			GetUserInfoResponse aur = new GetUserInfoResponse();
			aur.setAddress(user.getAddress());
			aur.setEmail(user.getEmail());
			return aur;
		} else {
			throw new UserFaultException("Unkown username.");
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse3
	 * @throws UserFaultException
	 */

	public org.example.www.user.AddUserResponse addUser(org.example.www.user.AddUser addUser)
			throws UserFaultException {
		AddUser curUser = getUserByName(addUser.getUsername()); 
		if(curUser != null) {
			getUsers().add(addUser);
			save();
			return new AddUserResponse();	
		} else {
			throw new UserFaultException("User with that username already exists.");
		}
	}
	
	public List<AddUser> getUsers() {
		return users;
	}
	
	public AddUser getUserByName(String name) {
		return getUsers().stream().filter(u -> u.getUsername().equals(name)).findFirst().orElse(null);
	}

}
