package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo_on_amazon {
	
public static void main(String[]args)throws Throwable {
		
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
  /* driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma");
   
  driver.findElement(By.xpath("//input[@type='submit']")).click(); 
   
  Thread.sleep(1000);
  
   driver.navigate().back();
   
   Thread.sleep(1000);
   
   driver.navigate().refresh();*/
		
		driver.findElement(By.xpath("//a[contains(text(),\"Amazon miniTV\")]")).click();
   
		// it need to be done
   
   
   
}
}