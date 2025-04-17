package Instagram;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//getting frames site & switching to frame 1 on site and sending some data
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		WebElement key=driver.findElement(By.xpath("//input[@name=\"mytext1\"]"));
		key.sendKeys("ram sai");
		
		//switching to other frame by first traveling to normal screen and switch to frame 2
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
	    driver.switchTo().frame(frame2);
	    WebElement keys2=driver.findElement(By.xpath("//input[@name=\"mytext2\"]"));
	    keys2.sendKeys("Prasanna");
	    
	    driver.switchTo().defaultContent();
	    
	    WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
	    driver.switchTo().frame(frame3);
	    WebElement keys3=driver.findElement(By.xpath("//input[@name=\"mytext3\"]"));
	    keys3.sendKeys("Gowri");
	    
	    //now directly switching to inner frame of frame 3 without any main page switch
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//div[@id=\"i6\"]//div[@class=\"AB7Lab Id5V1\"]")).click();
	  
	    
		
		
		
		

	}

}
