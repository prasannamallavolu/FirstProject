package sky;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sky.rostaging.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"btn btn-solid w-100 age_restriction_yes\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"alAccount\"]")).click();
		driver.findElement(By.xpath("//li[@class='onhover-dropdown mobile-account']//ul[@class='onhover-show-div']//li//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin@sky.com");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("12345678");

	}

}
