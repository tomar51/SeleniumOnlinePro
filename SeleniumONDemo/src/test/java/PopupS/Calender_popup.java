package PopupS;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_popup {
	
	public static void main(String[]args) {
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.goibibo.com/ ");
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions act = new Actions(driver);
	
	act.moveByOffset(20,30).click().perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}





//div[text()=\"March 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"25\"]
