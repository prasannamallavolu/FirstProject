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

public class MouseDrag2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
		//first get the first point location in the point of x and y axis
		
		System.out.println(min_slider.getLocation());
		
		//get the x axis only
		
		System.out.println(min_slider.getLocation().getX());
		
		//get the y axis only
		
		System.out.println(min_slider.getLocation().getY());
		
		//moving the slider
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).build().perform();
		
		System.out.println(min_slider.getLocation());
		
		//moving the max-slider--> we need to reduce the number by giving -value
		WebElement max_slider=driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[2]"));
		System.out.println("this is max slider" +max_slider.getLocation());
		act.dragAndDropBy(max_slider, -150, 0).build().perform();
		System.out.println(max_slider.getLocation());
		
		
		
	

	}

}
