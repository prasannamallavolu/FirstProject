package TestNGframework;

import org.testng.annotations.Test;

public class TestNGfirst {
	
	@Test(priority=1)
	void login()
	{
		System.out.println("login succesfully");
	}
	@Test(priority=3)
	void open()
	{
		System.out.println("open sucessfully");
		
	}
	@Test(priority=2)
	void logout()
	{
		System.out.println("logout successfully");
	}

}
