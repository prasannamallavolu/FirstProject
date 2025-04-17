package JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class jsexecutor1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	   WebElement name=driver.findElement(By.xpath("//input[@id=\"name\"]"));
	   
	   //sending keys with js executor
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   
	   js.executeScript("arguments[0].setAttribute('value','john')", name);
	   
	   //selecting radio button
	   WebElement btn=driver.findElement(By.xpath("//input[@id=\"male\"]"));
	   js.executeScript("arguments[0].click()", btn);
	   
		

	}

}
