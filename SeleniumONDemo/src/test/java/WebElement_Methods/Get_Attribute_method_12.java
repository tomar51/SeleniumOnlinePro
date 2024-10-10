package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_method_12 {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
   WebElement getattri 	=driver.findElement(By.name("firstname"));
		
	System.out.println(getattri.getAttribute("placeholder"));	


}
}