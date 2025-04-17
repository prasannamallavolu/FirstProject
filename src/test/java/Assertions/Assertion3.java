package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion3 {
	
	/*@Test
	void notsoft()
	{
		System.out.println("pass");
		System.out.println("fail");
	    Assert.assertEquals(123, 124);//fail test case so below cases wont execute here it will stops
	    System.out.println("pass");
	    System.out.println("fail");
	}*/
	
	@	Test
	void soft()
	{
		System.out.println("one");
		System.out.println("two");
		
		SoftAssert sa=new SoftAssert();
	    sa.assertEquals(123, 124);
	    
	    System.out.println("three");
	    System.out.println("four");
	    
	    sa.assertAll();//it should be given mandatory to achieve the soft assertions.
	    
	}

}
