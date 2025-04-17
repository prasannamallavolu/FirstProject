package TestNGframe3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@Test
	void login()
	{
		System.out.println("login done");
	}
	
	@Test
	void search()
	{
		System.out.println("search done");
	}
	
	@BeforeMethod
	void one()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	void two()
	{
		System.out.println("after method");
	}
	
	@BeforeClass
	void three()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	void four()
	{
		System.out.println("After class");
	}
	
	@BeforeTest
	void five()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	void six()
	{
		System.out.println("After test");
	}
	
	@BeforeSuite
	void seven()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	void eight()
	{
		System.out.println("After Suite");
	}
	
	
	
	

}
