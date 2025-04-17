package Instagram;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://chittipickles.in/?v=acd09c4937f5");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Shop Now")).click();
		//boolean h=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-bbe1df2 elementor-align-center elementor-mobile-align-center elementor-tablet-align-left elementor-widget elementor-widget-button']//span[@class='elementor-button-text'][normalize-space()='Shop Now']")).isDisplayed();
		//System.out.println(h);
		//driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-bbe1df2 elementor-align-center elementor-mobile-align-center elementor-tablet-align-left elementor-widget elementor-widget-button']//span[@class='elementor-button-text'][normalize-space()='Shop Now']")).click();
		//s.click();*/
		/*WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowids= driver.getWindowHandles();
		List<String> windowids2= new ArrayList(windowids);
		/*String parent=windowids2.get(0);
		String child=windowids2.get(1);
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();*/
		for(String winid:windowids2)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				Thread.sleep(5000);
				driver.close();
				Thread.sleep(5000);
				driver.quit();
			}
		
		}
		
		
		

	}

}
