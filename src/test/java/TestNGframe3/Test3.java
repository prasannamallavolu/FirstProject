package TestNGframe3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	void abc() 
	{
		System.out.println("i am abc");
	}
	
	@BeforeSuite
	void login() 
	{
	    System.out.println("i am before suite");
	}
	
	@AfterSuite
	void logout()
	{
		System.out.println("i am after suite");
	}

}
