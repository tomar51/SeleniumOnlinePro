package Handle_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Method_4_Sendkeys {
	
public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
	WebElement USERNAME = driver.findElement(By.id("user-name"));
		
	WebElement PASSWORD = driver.findElement(By.id("password"));
		
     WebElement  LOGIN =driver.findElement(By.className("btn_action"));
		
     Actions act= new Actions(driver);
     
    /* act.sendKeys(USERNAME,"standard_user").perform();
     
     act.sendKeys(PASSWORD,"secret_sauce").perform();
     
     act.click(LOGIN).perform();*/
     
                   //OR
     
  act.sendKeys(USERNAME,"standard_user").sendKeys(PASSWORD,"secret_sauce").click(LOGIN).build().perform();   
	

}
}