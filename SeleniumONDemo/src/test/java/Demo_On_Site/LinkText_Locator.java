package Demo_On_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator {

	public static void main(String[]args) {
		
		//we create webdriver object for launch the empty browser
			
		WebDriver driver = new ChromeDriver();	
			
		// Method 1 : for launch the application
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Amazon miniTV")).click();
		
		
}
}


