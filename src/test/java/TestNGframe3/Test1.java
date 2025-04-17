package TestNGframe3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	 
	@Test(priority=2)
	void login()
	{
		System.out.println("i am login");
	}
	
	@BeforeTest
	void logout()
	{
		System.out.println("i am before test");
	}
	
			

}
