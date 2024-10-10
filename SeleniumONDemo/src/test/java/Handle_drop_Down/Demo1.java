package Handle_drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		WebElement datelist =driver.findElement(By.id("day"));
		
		datelist.click();
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		WebElement monthlist =driver.findElement(By.id("month"));
		
		monthlist.click();
		
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		
		Thread.sleep(1000);

		WebElement yearlist =driver.findElement(By.id("year"));
		
		yearlist.click();

		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);


		
		



}
}