package Handle_Mouse_Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveBy_offset_Action_Method {
	
	public static void main(String[]arg) throws Throwable {
		
		//WebDriver driver =new FirefoxDriver();  // not run in this
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.makemytrip.com");
		
		Actions act =new Actions(driver);
		
		Thread.sleep(1000);
		
		//act.moveByOffset(60,90).click().perform();
		
		act.moveByOffset(50,30).click().perform();
		

		
		//if we use Actions class we always create object for it because 
		//it is non static class and always use  perform() with it 
		
		
		
		
		
		
		
		
		
		
		
	}

}
