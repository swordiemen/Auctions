package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.List;

import org.example.www.user.AddUser;
import org.example.www.user.GetUserInfo;
import org.example.www.user.UserFaultException;
import org.example.www.user.UserServiceSkeleton;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.www.user.getuserinfo.GetUserInfoResponse;

public class UserServiceTest {
	private UserServiceSkeleton service = new UserServiceSkeleton();

	private static AddUser user1;
	private static AddUser user2;
	
	@BeforeClass
	public static void init() {
		user1 = new AddUser();
		user1.setUsername("swordie");
		user1.setPassword("savePass.exe");
		user1.setEmail("whoami@utwente.nl");
		user1.setAddress("Hengelosestraat 113");
		user2 = new AddUser();
		user2.setUsername("huib");
		user2.setPassword("letmein");
		user2.setEmail("whoami@utwente.nl");
		user2.setAddress("plataanlaan 3");
	}
	
	@Before
	public void before() {
		service.clear();
	}
	
	@Test(expected = UserFaultException.class)
	public void testClearAndGetFault() throws UserFaultException {
		service.addUser(user1);
		service.clear();
		GetUserInfo gui = new GetUserInfo();
		gui.setUsername(user1.getUsername());
		GetUserInfoResponse guir = service.getUserInfo(gui);
	}
	
	@Test
	public void testGetAndSetValid() throws UserFaultException {
		service.addUser(user1);
		service.addUser(user2);
		GetUserInfo gui = new GetUserInfo();
		gui.setUsername(user1.getUsername());
		GetUserInfoResponse guir = service.getUserInfo(gui);
		assertTrue(guir.getAddress().equals(user1.getAddress()));
		gui.setUsername(user2.getUsername());
		guir = service.getUserInfo(gui);
		assertFalse(guir.getAddress().equals(user1.getAddress()));
		assertTrue(guir.getEmail().equals(user2.getEmail()));
	}
	
	@Test(expected = UserFaultException.class)
	public void testSetInvalidByAlreadyExists() throws UserFaultException {
		service.addUser(user1);
		service.addUser(user1);
	}
}
