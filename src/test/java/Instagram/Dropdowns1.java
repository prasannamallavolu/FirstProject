package Instagram;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns1 {

	public static void main(String[] args) throws InterruptedException {
		//practice link for drop down 
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//giving entire wenelement to select object syntax
		WebElement dropdown=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select dd=new Select(dropdown);
		
		//1.selecting the value with visible text (we have 3 ways to select)
		dd.selectByVisibleText("China");
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Japan");
		Thread.sleep(1000);
		
		//selecting the option with value
		dd.selectByValue("usa");
		
		//select the value by index
		dd.selectByIndex(5);
		
		//getOptions returns all the valiues in the dropdown
		
		List<WebElement> options=dd.getOptions();
		int count=options.size();
		System.out.println(count);
		
		//print all the options in the list
		
		for(WebElement x:options)
		{
			System.out.println(x.getText());
		}*/
		
		//bootstrap drop down 2nd type
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"multiselect-selected-text\"]")).click();
		
		//selecting single option
		driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();
		
		//count all the options
		List<WebElement> options=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int s=options.size();
		System.out.println(s);
		
		//print all the elements
		
		/*for(WebElement x:options)
		{
			System.out.println(x.getText());
			x.click();
		
		}*/
		
		for(WebElement t:options)
		{
			if(t.getText().equals("Java") || t.getText().equals("Python") || t.getText().equals("MySQL"))
					t.click();
		}
		
		
		
		
		

	}

}
