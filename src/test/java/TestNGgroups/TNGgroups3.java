package TestNGgroups;

import org.testng.annotations.Test;

public class TNGgroups3 {
	
	@Test(priority=1,groups= {"sanity","regression","ftp"})
	void groups3()
	{
		System.out.println("see group33");
	}
	
	@Test(priority=2,groups= {"sanity","regression","ftp"})
	void groups33()
	{
		System.out.println("see group33");
	}

}
