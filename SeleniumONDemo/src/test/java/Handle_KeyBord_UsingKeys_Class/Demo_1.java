package Handle_KeyBord_UsingKeys_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {
	
public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		// normal app
	
	/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");*/
		
		//case:1
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);*/

		//case:2
		
	WebElement	username =driver.findElement(By.id("user-name"));

	//username.sendKeys(\"standard_user\",Keys.);
	
	
	
	
	
	
	
	
}
}



