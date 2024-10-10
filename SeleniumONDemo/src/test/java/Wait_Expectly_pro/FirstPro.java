package Wait_Expectly_pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPro {
	
public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/v1/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.className("btn_action")).click();
	
	
	}

}
