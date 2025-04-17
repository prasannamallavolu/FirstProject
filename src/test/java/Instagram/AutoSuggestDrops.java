package Instagram;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestDrops {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 WebElement sent=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
		 sent.click();
		 sent.sendKeys("Selenium");
		 Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li[@class=\"sbct PZPZlf\"]"));
		 System.out.println(options.size());
		 for(WebElement x:options)
		 {
			 if(x.getText().equals("selenium"))
			 {
				 x.click();
				 break;
			 }
		 }
		
		
		 
		 
		 

	}

}
