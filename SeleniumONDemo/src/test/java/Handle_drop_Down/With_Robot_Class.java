package Handle_drop_Down;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_Robot_Class {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		WebElement datelist =driver.findElement(By.id("day"));
		
		datelist.click();
		
		Robot rob =new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		
          Thread.sleep(1000);
		
		WebElement monthlist =driver.findElement(By.id("month"));
		
		monthlist.click();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_UP);

		Thread.sleep(1000);

		WebElement yearlist =driver.findElement(By.id("year"));
		
		yearlist.click();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_UP);




}
}