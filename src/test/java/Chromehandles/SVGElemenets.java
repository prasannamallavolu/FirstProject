package Chromehandles;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class SVGElemenets {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
	    //SVG is an sub and we can achive like this 
	    driver.findElement(By.xpath("//button[@title=\"Timesheets\"]//*[name()='svg']")).click();
	    
	    
		

	}

}
