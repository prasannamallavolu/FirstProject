package TestNGframe2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	
	@BeforeClass
	void login()
	{
		System.out.println("i am login");
		
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("i am search");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("i am adv search");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("i am logout");
	}
	

}
