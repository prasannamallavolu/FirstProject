package Instagram;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement f1=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		Thread.sleep(2000);
		f1.clear();
		f1.sendKeys("Ram sai");
		WebElement btn=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
		Thread.sleep(2000);
		
		//double clicking
		Actions act=new Actions(driver);
		act.doubleClick(btn).perform();
		Thread.sleep(2000);
		
		//validating the first cell data wkth second cell after double clicking
		
		WebElement f2=driver.findElement(By.xpath("//input[@id=\"field2\"]"));
		Thread.sleep(2000);
		
		@SuppressWarnings("deprecation")
		String text2=f2.getAttribute("value");
		System.out.println(text2);
		
		
		
		
		
		

	}

}
