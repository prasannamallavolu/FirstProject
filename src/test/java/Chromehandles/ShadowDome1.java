package Chromehandles;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class ShadowDome1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//1.shadow element first type-syntax imp
		SearchContext shadow=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		WebElement one=shadow.findElement(By.cssSelector("#shadow-element"));
		System.out.println(one.isDisplayed());
		
		//Nested shadow element
		SearchContext shadow1=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2=shadow1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		WebElement two=shadow2.findElement(By.cssSelector("#nested-shadow-element"));
		System.out.println(two.isDisplayed());
		
		//Multi-Nested Root
		SearchContext shadow4=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow5=shadow4.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(3000);
		SearchContext shadow6=shadow5.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(4000);
		WebElement three=shadow6.findElement(By.cssSelector("#multi-nested-shadow-root"));
		System.out.println(three.isDisplayed());
		
		
		
		
		
		
		
		
		

	}

}
