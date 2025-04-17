package TestNGframe3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=1)
	void firstlogin()
	{
		System.out.println("i am first login");
	}
	
	@AfterTest
	void logout()
	{
		System.out.println("i am after test");
	}

}
