package First_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	public static void main(String[]args) {
	
	//we create webdriver object for launch the empty browser
		
	WebDriver driver = new ChromeDriver();	
		
	// Method 1 : for launch the application
	
	driver.get("https://www.flipkart.com/");
	
	//Method 2 : for get the page title
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	//Method 3 : for get the current URL both type we can use both type for this
	
	//System.out.println(driver.getCurrentUrl()); 
	
	String URL = driver.getCurrentUrl();
	System.out.println( URL);
	
	//Method 4 : for get the page source
	
	//String source = driver.getPageSource();
	//System.out.println(source);
	
	// for maximize the page
	
	driver.manage().window().maximize();
	
	// for minimize the page
	
	driver.manage().window().minimize(); 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
