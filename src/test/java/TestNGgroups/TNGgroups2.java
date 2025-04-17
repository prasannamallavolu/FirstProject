package TestNGgroups;

import org.testng.annotations.Test;

public class TNGgroups2 {
	
	@Test(priority=1,groups= {"regression"})
	void group2()
	{
		System.out.println("see group2");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void group22()
	{
		System.out.println("see group22");
	}

}
