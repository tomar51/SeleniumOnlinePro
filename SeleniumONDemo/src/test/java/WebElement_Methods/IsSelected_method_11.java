package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_method_11 {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
	WebElement radiobutton=	driver.findElement(By.xpath("//input[@value=\"1\"]"));
		
	radiobutton.click()	;
	
	if(radiobutton.isSelected()) {
		
		System.out.println("button selected");
	}
	else {
		
		System.out.println("button not selected");
	}

}
}