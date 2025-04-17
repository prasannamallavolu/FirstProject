package Instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.instagram.com");
		driver.get("https://www.flipkart.com/");
		String s = "flipkart";
		String s2= driver.getTitle();
		if(s.equals(s2)) 
		System.out.println("Pass");
		else
			System.out.println("Fail");	
		driver.quit();
	}

}
