package Instagram;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAss1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean h=driver.findElement(By.className("wikipedia-search-input")).isDisplayed();
		System.out.println(h);
		WebElement d=driver.findElement(By.className("wikipedia-search-input"));
		d.click();
		d.sendKeys("selenium");
		driver.findElement(By.xpath("//input[contains(@type,\"submit\")]")).click();
		List<WebElement> counting=driver.findElements(By.xpath("//div[contains(@id,'wikipedia-search')]/a[(@target='_blank')]"));		
		System.out.println(counting.size());
		
	    
	    
		
		

	}

}
