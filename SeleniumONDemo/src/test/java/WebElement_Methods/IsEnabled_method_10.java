package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_method_10 {
	

public static void main(String[]args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement newacclink=driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		
		//Method 10: isEnabled 
		
		if(newacclink.isEnabled()) {
			
			newacclink.click();
		}
		else {
			System.out.println("link not enabled");
		}
		
		
		
}
}