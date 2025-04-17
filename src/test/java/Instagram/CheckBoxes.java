package Instagram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement checkbox=driver.findElement(By.id("sunday"));
		System.out.println(checkbox.isSelected());
		//checkbox.click();
		System.out.println(checkbox.isSelected());
		List<WebElement> all=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		System.out.println(all.size());
		/*for(int i=0;i<all.size();i++)
		{
			all.get(i).click();
		}
		for(WebElement x:all)
		{
			x.click();
		}*/
		/*for(int j=all.size()-3;j<=all.size();j++)
		{
			all.get(j).click();
		}*/
		for(int l=0;l<3;l++)
		{
			all.get(l).click();
		}
		for(int i=0;i<all.size();i++)
		{
			if(all.get(i).isSelected())
			{
				all.get(i).click();
			}
			else
			{
				all.get(i).click();
			}
		}
		for(WebElement x:all)
		{
			x.click();
		}
		
		
		

	}

}
