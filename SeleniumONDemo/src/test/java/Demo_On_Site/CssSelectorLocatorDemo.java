package Demo_On_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorDemo {

	public static void main(String[]args) {
		
		//we create webdriver object for launch the empty browser
			
		WebDriver driver = new ChromeDriver();	
			
		// Method 1 : for launch the application
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.cssSelector("[name=\"user-name\"]"))
		.sendKeys("standard_user\r\n");
		
		driver.findElement(By.cssSelector("[placeholder=\"Password\"]"))
		.sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("[value=\"LOGIN\"]")).click();
				

}
}