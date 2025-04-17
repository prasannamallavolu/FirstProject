package TestNGgroups;

import org.testng.annotations.Test;

public class TNGgroups {
	
	@Test(priority=1,groups={"sanity"})
	void login()
	{
		System.out.println("Hi");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void search()
	{
		System.out.println("Hello");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void advsearch()
	{
		System.out.println("namaste");
	}
	
	@Test(priority=4,groups= {"regression"})
	void logout()
	{
		System.out.println("bye");
	}

}
