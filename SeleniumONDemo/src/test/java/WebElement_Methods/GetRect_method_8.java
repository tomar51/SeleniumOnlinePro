package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetRect_method_8 {
	
	public static void main(String[]args) {
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
			
		//method 8: getRect() in this we get location and size both
		
	WebElement rect =driver.findElement(By.xpath("//a[text()=\"Best Sellers\"]"));
		
   Rectangle  rectvalue = rect.getRect();
   
   //for location
   
   System.out.println(rectvalue.getX());
   System.out.println(rectvalue.getY());
   
   //for size
   
   System.out.println(rectvalue.getHeight());
   System.out.println(rectvalue.getWidth());



		
		
		
		
	}
}
