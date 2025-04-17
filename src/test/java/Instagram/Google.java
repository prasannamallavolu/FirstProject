package Instagram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver2.get("https://www.google.com");
		//driver2.findElement(By.id("APjFqb")).sendKeys("iPhone");
		//WebElement search=driver2.findElement(By.id("APjFqb"));
		//search.sendKeys("Makbook");
		//WebElement lucky=driver2.findElement(By.name("q"));
		//boolean luck=lucky.isDisplayed();
		//System.out.println(luck);
		//driver2.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-9ed1ab3e-4343-420c-b058-68beeef4c9ff&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T%2bWb8DN7DVmL5sbY%2bn%2b30S7n%2fgIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-https%3a%2f%2fwww%2eultimatix%2enet%2f");
		//WebElement search=driver2.findElement(By.id("ultimatix-image"));
		//boolean ram=search.isDisplayed();
		//System.out.println(ram);
		//driver2.get("https://webdriveruniversity.com/index.html");
		//List<WebElement> links = driver2.findElements(By.className("col-md-12"));
		//System.out.println(links.size());
		//driver2.get("https://demo-opencart.com/");
		//List<WebElement> imgcount = driver2.findElements(By.tagName("adsa"));
		//System.out.println(imgcount.size());
		//driver2.findElement(By.id("sdfdsdds"));
		//driver2.get("https://demo.nopcommerce.com/");
		//driver2.manage().window().maximize();//to maximize the window
		//driver2.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver2.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//driver2.get("https://demo.nopcommerce.com/");
		//driver2.findElement(By.linkText("Log in")).click();
		//System.out.println(driver2.findElement(By.linkText("Log in")).isDisplayed());
		//System.out.println(driver2.findElement(By.partialLinkText("log")).isDisplayed());
		//List<WebElement> imgcount = driver2.findElements(By.tagName("img"));
		//System.out.println(imgcount.size());
		//List<WebElement> clscount = driver2.findElements(By.className("item-box"));
		//System.out.println(clscount.size());
		
		/*driver2.get("https://demoblaze.com");
		List<WebElement> imgcnt= driver2.findElements(By.tagName("img"));
		System.out.println(imgcnt.size());
		List<WebElement> clscnt=driver2.findElements(By.tagName("a"));
		System.out.println(clscnt.size());
		driver2.get("https://demoblaze.com");
		driver2.findElement(By.id("login2")).click();
		driver2.findElement(By.id("loginusername")).click();*/
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.mozobus.com/");
	    driver2.findElement(By.linkText("Customer Login")).click();
	    driver2.findElement(By.id("email")).sendKeys("prasannamallavolu@gmail.com");
	    driver2.findElement(By.id("password")).sendKeys("123456789");
	   
	    
		
		
	
		
		
		
		
		
		
		

	}

}
