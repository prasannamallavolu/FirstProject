package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNGDataProvider {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="dp")
	void login(String email, String pwd) throws InterruptedException
	{
	
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    Thread.sleep(2000);
	    boolean account=driver.findElement(By.xpath("//div//h2[text()='My Account']")).isDisplayed();
	    if(account==true)
	    {
	    	driver.findElement(By.xpath("//aside//div//a[text()='Logout']")).click( );
	    	Assert.assertTrue(true);
	    }
	    else
	    	Assert.fail();
	}
		
	
	
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	    @DataProvider(name="dp")
	    Object[][] loginData()
	    {
		 
	    	Object arr[][]= 
	    		            {
	    			{"WYQk@gmail.com","WmJt@623"},
	    			{"xyz@gamil.com","test123"},
	    			{"aa@gmail.com","test123"},
	    			{"rrr@gmail.com","345"}
	    			
	    	                };
	    	return arr;
	    	}
	    			
	    }


	
