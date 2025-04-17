package Instagram;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyBoardActions2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//cntrl + click to open the tab in other window
		WebElement register=driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(register).perform();
		
		
		//switch to register page
		Set<String> windows=driver.getWindowHandles();
		List<String> windowids=new ArrayList(windows);
		
		driver.switchTo().window(windowids.get(1));
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("ram sai");
		
        //getting back to home page
		driver.switchTo().window(windowids.get(0));
	}

}
