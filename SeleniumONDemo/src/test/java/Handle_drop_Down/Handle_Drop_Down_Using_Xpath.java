package Handle_drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Drop_Down_Using_Xpath {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[@value=\"15\"]")).click();
		
		driver.findElement(By.xpath("//option[text()='Sep']")).click();
		
		driver.findElement(By.xpath("//option[text()='2014']")).click();
		

}
}