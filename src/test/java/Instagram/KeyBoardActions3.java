package Instagram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyBoardActions3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//first get one window
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	    
		//switch to new chrome browser
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		

	}

}
