package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method_6 {
	
public static void main(String[]args) {
		
		WebDriver driver =new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		
	//WebElement	ele =driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
	
		driver.get("https://www.amazon.in");
	WebElement	ele =driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));

	//method 6 getLoction()
	
	Point loc=ele.getLocation();
	
	System.out.println(loc.getX());
	System.out.println(loc.getY());
	
	System.out.println("*******************");
	// method 7 getSize()
	
   Dimension size =ele.getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());


	
	
}
}