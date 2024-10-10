package First_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
	public static void main(String[]args) {
		
	//we create webdriver object for launch the empty browser
		
	WebDriver driver = new ChromeDriver();	
		
	// Method 1 : for launch the application
	
	driver.get("https://www.flipkart.com/");
	
//navigate use to launch the application but it not use in real time 	
	
	//driver.navigate().to("https://www.flipkart.com/");
	
	// for click on back word sign 
	
	driver.navigate().back();
		
	// for click on ford word sign 
	
	driver.navigate().forward();
	
	//for refresh 
	
	driver.navigate().refresh();
	}
}
