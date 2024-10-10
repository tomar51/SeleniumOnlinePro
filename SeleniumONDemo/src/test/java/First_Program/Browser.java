package First_Program;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Browser {
	

	public static void main(String[]args) throws IOException{
		
		WebDriver driver = new EdgeDriver();
		
	//WebDriver driver = new ChromeDriver();	
		
	//WebDriver driver =	new FirefoxDriver();
	
	driver.get("https://www.flipkart.com/");
	
	/*String title = driver.getTitle();
	
	System.out.println(title);
	
	//System.out.println(driver.getCurrentUrl()); 
	
	String URL = driver.getCurrentUrl();
	System.out.println( URL);*/
	
	
	//Use TakesScreenshot method to capture screenshot
	
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	
	//Saving the screenshot in desired location
	
	File pageshot = screenshot.getScreenshotAs(OutputType.FILE);
	
	//Path to the location to save screenshot
	
	File dest= new File("C:\\Users\\atris\\Pictures\\Screenshots/Screen.png");
	
	FileHandler.copy(pageshot, dest);
	
	System.out.println("Screenshot is captured");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
