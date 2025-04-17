package TestNGframework4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethods {
	
	@Test(priority=1)
	void login()
	{
		Assert.assertTrue(true);//change to false to see 3 cases fail
		System.out.println("No dependcy");
	}
	
	@Test(priority=2,dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("Depend on search");
	}
	
	@Test(priority=3, dependsOnMethods= {"search","login"})
	void advsearch()
	{
		System.out.println("dependent on seach and login");
	}
	
	@Test(priority=4)
	void logout()
	{
		System.out.println("no dependent");
	}
	
	
	

}
