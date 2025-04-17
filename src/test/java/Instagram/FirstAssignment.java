package Instagram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAssignment {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//a[starts-with(@aria-label,\"Gmail \")]"));
		s.click();
		WebElement g=driver.findElement(By.xpath("//input[contains(@type,\"email\")]"));
		g.click();
		g.sendKeys("ramsaiguptae60@gmail.com");
		Thread.sleep(5000);
		WebElement f=driver.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b\"]/span"));
		f.click();
		
		
		
		
	}

}
