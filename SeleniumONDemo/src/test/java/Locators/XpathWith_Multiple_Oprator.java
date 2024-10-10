package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class XpathWith_Multiple_Oprator {
	
	public static void main(String[]args) {
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	// with multiple Attribute with and operator  
	
	//driver.findElement(By.xpath("//input[@type=\"text\"and@name=\"q\"]")).sendKeys("puma");
		
	// with or operator 
	
	driver.findElement(By.xpath("//input[@type=\"t\"or@name=\"q\"]")).sendKeys("puma");
		
	driver.findElement(By.xpath("//button[@type=\"submit\"and@class=\"_2iLD__\"]")).click();	
		
		
		
		
		
		
	}

}
