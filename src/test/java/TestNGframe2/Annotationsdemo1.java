package TestNGframe2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationsdemo1 {

	@BeforeMethod
	void login()
	{
		System.out.println("before method");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("i am search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("after method");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("i am adv search");
	}
	
	
	
	

}
