package AssignmentsSeries2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//switching to the frame
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);	
		//driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("09/08/2024");
		
		// taken string values because everything on webpage will be in strings
		String year="2024",month="February",day="25";
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		// here written while loop because while loop runs till the condition pass
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String Currentyear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(month.equals(currentmonth) && year.equals(Currentyear))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();	
			
		}
		// here checking the day with tables concept
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
		
		
		
		

	}

}
