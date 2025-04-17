package JSExecutor;

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



public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chittipickles.in/?v=acd09c4937f5");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//scroll by pixel number
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		js.executeScript("window.scrollBy(0,300)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		WebElement sn=driver.findElement(By.xpath("//div[@data-id=\"bbe1df2\"]//a[@class=\"elementor-button elementor-button-link elementor-size-md\"][1]"));
		js.executeScript("arguments[0].click()", sn);
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(4000);
		
		//WebElement five=driver.findElement(By.xpath("(//div[@class=\"cfvsw-swatch-inner\" and text()=\"500 G\"])[1]"));
		//js.executeScript("arguments[0].click()", five);
		
		WebElement img=driver.findElement(By.xpath("(//img[@class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail\"])[1]"));
		js.executeScript("arguments[0].click()", img);
		
		WebElement five1=driver.findElement(By.xpath("(//div[@class=\"cfvsw-swatch-inner\"])[1]"));
		js.executeScript("arguments[0].click()",five1);
		
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		js.executeScript("arguments[0].click()",add);
		
		Thread.sleep(2000);
		WebElement vcart=driver.findElement(By.xpath("(//a[@class=\"button wc-forward\"])[1]"));
		js.executeScript("arguments[0].click()",vcart);
		
		Thread.sleep(2000);
		WebElement cout=driver.findElement(By.xpath("//a[@class=\"checkout-button button alt wc-forward\"]"));
		js.executeScript("arguments[0].scrollIntoView();",cout);
		js.executeScript("arguments[0].click()",cout);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("(//input[@class=\"input-text \"])[1]")).sendKeys("Ram Sai");
		driver.findElement(By.xpath("//input[@name=\"billing_last_name\"]")).sendKeys("vankayala");
		driver.findElement(By.xpath("//input[@id=\"billing_company\"]")).sendKeys("tcs");
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//input[@id=\"billing_address_1\"]")).sendKeys("SR Nilayam");
		driver.findElement(By.xpath("//input[@id=\"billing_city\"]")).sendKeys("hyderabad");
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//input[@id=\"billing_postcode\"]")).sendKeys("500019");
		driver.findElement(By.xpath("//input[@name=\"billing_phone\"]")).sendKeys("6281695660");
		driver.findElement(By.xpath("//input[@id=\"billing_email\"]")).sendKeys("ramsaigupta@gmail.com");
		WebElement verify=driver.findElement(By.xpath("//span[text()=\"Click here to verify your Phone\"]"));
		
		js.executeScript("arguments[0].click()",verify);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
