package Handle_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Method_3 {
	
	public static void main(String[]args) {
		
		
		WebDriver driver = new ChromeDriver();	
					
		driver.get("https://www.flipkart.com/");
		
	WebElement	ele=driver.findElement(By.xpath("//span[text()='Mobiles']"));
	
	// method 3: click for click an element 
	
	Actions act= new Actions(driver);
	
	act.click(ele).perform();

}
}