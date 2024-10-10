package Scroll_handle_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_By_Java_ScriptExecutor_Exp2 {
	
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement ele =driver.findElement(By.xpath("//a[text()='Games']"));
		
		// exp 1 not done
		
		/*Point txt = ele.getLocation();
		
		System.out.println(txt.getX());
		System.out.println(txt.getY());
		
		JavascriptExecutor js =(JavascriptExecutor)driver;// it is down casting 
		
		js.executeAsyncScript("window.scrollBy(436,787)");
		
		ele.click();*/
		
		//exp 2
		
		/*JavascriptExecutor js =(JavascriptExecutor)driver;// it is down casting
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		ele.click();*/
		
		// exp 3
		
		JavascriptExecutor js =(JavascriptExecutor)driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		
		
		
		
	}

}
