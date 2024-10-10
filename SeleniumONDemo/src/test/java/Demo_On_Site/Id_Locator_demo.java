package Demo_On_Site;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator_demo {

	public static void main(String[]args) {
					
	WebDriver driver = new ChromeDriver();	

	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/v1/");
		
	driver.findElement(By.id("user-name")).sendKeys("standard_user");	
		
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.id("login-button")).click();	
		
		
		
		
		
		
		
		
	}
}
