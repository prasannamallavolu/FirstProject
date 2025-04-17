package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1 {
	
	String name1="RAM";
	String name2="SAI";
	String name3="RAM";
	
	@Test
	void compare1()
	{
		if(name1.equals(name2))
		{
			System.out.println("two strings are same");
		}
		else
		{
			System.out.println("two string are not same ");
		}
		
	}
	
	@Test
	void compare2()
	{
		Assert.assertEquals(name1, name2);
	}

}
