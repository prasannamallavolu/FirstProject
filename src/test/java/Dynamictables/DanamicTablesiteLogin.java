package Dynamictables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DanamicTablesiteLogin {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://testautomationpractice.blogspot.com/p/download-files_25.html");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     int size=driver.findElements(By.xpath("//li//a[@href=\"#\"]")).size();
	     int rowsize=driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
	     int columnsize=driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();
	     
	     for(int i=1)
	     
	     
	     

	}

}
