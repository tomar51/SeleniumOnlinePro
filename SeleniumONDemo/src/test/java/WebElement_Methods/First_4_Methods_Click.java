package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_4_Methods_Click {
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		//method:1 sendkeys()

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");	
		
	//method:2 click()	
		
	driver.findElement(By.id("nav-search-submit-button")).click();	
		Thread.sleep(1000);
	//method:3 clear()	
		
	WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	
	search.clear();
	
	Thread.sleep(1000);
	
	search.sendKeys("nike");
	
	Thread.sleep(1000);
	
	//method:4 search()
	
	search.submit();
	
	
		
}
}