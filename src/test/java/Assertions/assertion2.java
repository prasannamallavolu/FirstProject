package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion2 {
	
	@Test
	void Assertions()
	{
		//Assert.assertEquals("RAM", "RAM");//pass
		//Assert.assertEquals(123, 345);//fail
		//Assert.assertEquals("123", 123);//fail
		//Assert.assertEquals(123, "abc");//fail
		
		//Assert.assertNotEquals("test", "pass");//pass
		//Assert.assertNotEquals(123, 123);//fail
		
		//Assert.assertTrue(true);//passed
		//Assert.assertTrue(true);//failed
		//Assert.assertTrue(1==2);//failed
		//Assert.assertTrue(1!=2);//pass
		
		//Assert.assertFalse(false);//pass
	
		//Assert.fail()//to fail the test case
		
		
	}

}
