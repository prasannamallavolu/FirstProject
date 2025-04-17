package Chromehandles;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLink {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		int noofblinks=0;
		
		//putting all links in the list 
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//check the link has some value or not
		for(WebElement alink:links)
		{
			String a1link=alink.getAttribute("href");// get the link value
			if(a1link==null || a1link.isEmpty())
			{
				System.out.println("no value there");
				continue;
			}
			try {
				URL url1=new URL(a1link);// convert the string to url
				HttpURLConnection http1=(HttpURLConnection) url1.openConnection();//Establishing the connection to run url
				http1.connect();
				
				if(http1.getResponseCode()>400)//checking url response code
				{
					System.out.println("Broken link");
					noofblinks++;
				}
				else {
					System.out.println("Not broken link");
				}
			}
				catch(Exception e)
				{
					
				}
			
			
			
			
		}
		System.out.println(noofblinks);
		
		
		

	}

}
