package Scroll_handle_;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_By_Java_ScriptExecutor {
	
	//EXp 1
	
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.meesho.com");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		for(int i =0;i<3;i++) {
			
			Thread.sleep(1000);
			
			js.executeScript("window.scrollBy(0,1000)");
		}
		for(int i=0;i<3;i++) {
			 
			Thread.sleep(1000);
			
			js.executeScript("window.scrollBy(0,-500)");
		}
		
	}

}
