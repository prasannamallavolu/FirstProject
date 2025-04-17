package Instagram;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// finding the no of rows in the table 
		int rowSize =driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println(rowSize);
		
		//finding the no of columns in the table
		
		int columnSize=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println(columnSize);
		
		String s=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
		System.out.println(s);
		
		// printing all the data in the table
		for(int r=2;r<=rowSize;r++)
		{
			for(int c=1;c<=columnSize;c++)
			{
				String x=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		
		// Printing the books name which are written by mukesh
		
		String y="Mukesh";
		
		for(int t=2;t<=rowSize;t++)
		{
			for(int d=2;d<=2;d++)
			{
				String z=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+t+"]//td["+d+"]")).getText();
				{
					if(y.equals(z))
					{
						System.out.println(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+t+"]//td["+(d-1)+"]")).getText());
					}
				}
			}
		}
		
		// getting total values in the last column
		int total=0;
		
		for(int n=2;n<=rowSize;n++)
		{
			String a=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+n+"]//td[4]")).getText();
			total+=Integer.parseInt(a);
		}
		System.out.println(total);
	 	


	}

}
