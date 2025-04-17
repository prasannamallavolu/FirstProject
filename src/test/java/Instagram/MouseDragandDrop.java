package Instagram;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseDragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement washington =driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		WebElement usa=driver.findElement(By.xpath("//div[@id=\"box103\"]"));
		
		//drag & drop
		Actions act=new Actions(driver);
		act.dragAndDrop(washington, usa).build().perform();
		

	}

}
