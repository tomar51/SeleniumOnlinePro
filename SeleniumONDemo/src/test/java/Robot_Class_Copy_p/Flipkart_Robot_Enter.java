package Robot_Class_Copy_p;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Robot_Enter {
	
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
			
			driver.findElement(By.name("q")).sendKeys("puma tshirt");
			
	   Robot rob = new Robot();
	   
	   rob.keyPress(KeyEvent.VK_ENTER);
	   
	   rob.keyRelease(KeyEvent.VK_ENTER);
			

}
}