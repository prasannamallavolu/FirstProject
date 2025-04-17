package Instagram;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentimp1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// below is the site link
		driver.get("https://blazedemo.com/");
	    driver.manage().window().maximize();
	    WebElement dropdown=driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
	    Select dd=new Select(dropdown);
	    dd.selectByVisibleText("Portland");
	    WebElement dropdown2=driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
	    Select dd2=new Select(dropdown2);
	    dd2.selectByVisibleText("London");
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    
	    //int columnSize=driver.findElements(By.xpath("//table[@class=\"table\"]//th")).size();
	    
	    int rowSize=driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
	    String arr[]=new String[rowSize-1];
	    
	    // put the data in the array
	    
	    // taken ar because array starts with zero
	    
	    int ar=0;
	    for(int i=1;i<rowSize;i++)
	    {
	    	arr[ar]=driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+i+"]//td[6]")).getText();
	    	ar++;
	    }
	    
	    // Sort the data present in the array
	    Arrays.sort(arr);
	    
	      
	    for(int j=1;j<rowSize;j++)
	    {
	    		String s=driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+j+"]//td[6]")).getText();
	    		if(s.equals(arr[0]))
	    		{
	    			driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+j+"]//td[1]")).click();
	    			break;
	    		}
	    }
	    
	    // Fill all the required data
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id=\"inputName\"]")).sendKeys("Ram sai");
	    driver.findElement(By.xpath("//input[@id=\"address\"]")).sendKeys("sngar");
	    driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Hyd");
	    driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("TG");
	    driver.findElement(By.xpath("//input[@id=\"zipCode\"]")).sendKeys("500019");
	    driver.findElement(By.xpath("//input[@id=\"creditCardNumber\"]")).sendKeys("123456789");
	    driver.findElement(By.xpath("//input[@id=\"nameOnCard\"]")).sendKeys("Gupta");
	    driver.findElement(By.xpath("//input[@name=\"rememberMe\"]")).click();
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    Thread.sleep(5000);
	    
	    // Find the end message and print yes if message presents
	    
	    String name1="Thank you for your purchase today!";
	    String name2=driver.findElement(By.xpath("//div[@class=\"container hero-unit\"]//h1")).getText();
	    
	    if(name1.equals(name2))
	    {
	    	System.out.println("Message there");
	    }
	    else
	    {
	    	System.out.println("Message not there");
	    }
	    
	    
	}

}
