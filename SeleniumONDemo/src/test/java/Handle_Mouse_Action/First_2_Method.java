package Handle_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First_2_Method {
	
	public static void main(String[]args) {
		
			
		WebDriver driver = new ChromeDriver();	
					
		driver.get("https://www.flipkart.com/");
		
	WebElement ele =driver.findElement(By.xpath("//span[text()='Fashion']"));
	
	Actions act =new Actions(driver);
	
	//method 1: moveToElement for move mouse that element 
	
	//act.moveToElement(ele).perform();
	
	// method 2: contextClick for right click the element 
	
	act.contextClick(ele).perform();
	
	

}
}