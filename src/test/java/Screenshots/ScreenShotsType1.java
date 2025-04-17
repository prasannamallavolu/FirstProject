package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ScreenShotsType1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//taking full screenshots
	
		/*File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File("C:\\Users\\ramsa\\eclipse-workspace\\FirstProject\\src\\test\\java\\Screenshots1\\fullpage.png");
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots2\\fullpage1.png");
		sourcefile.renameTo(targetfile);*/
		
		//Taking particular part as screenshot
		/*WebElement selected=driver.findElement(By.xpath("//div[@class=\"news-list-homepage\"]"));
		File srcfile=selected.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"\\Screenshots2\\selectedpage.png");
		srcfile.renameTo(trgfile);*/
		
		//Taking image screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		File srcfile=logo.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"\\Screenshots2\\logo.png");
		srcfile.renameTo(trgfile);
		
		
		
		
		
	

	}

}
