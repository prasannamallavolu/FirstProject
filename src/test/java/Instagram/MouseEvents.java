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

public class MouseEvents {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement pointer=driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
		WebElement laptops=driver.findElement(By.xpath("//a[text()='Laptops']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(pointer).moveToElement(laptops).click().build().perform();
		
		

	}

}
