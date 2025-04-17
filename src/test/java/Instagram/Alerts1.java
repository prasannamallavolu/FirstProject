package Instagram;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		boolean name=driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).isDisplayed();
		WebElement option=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		System.out.println(name);
		option.click();
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		WebElement name2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		name2.click();
		myalert.dismiss();
		WebElement name3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Thread.sleep(5000);
		name3.click();
		Alert myalert1=driver.switchTo().alert();
		myalert1.sendKeys("Ram Sai");
		myalert1.accept();

	}

}
