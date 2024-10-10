package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetDomAttribute_Method_15 {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
        Thread.sleep(1000);
        
        WebElement domattri =driver.findElement(By.xpath("//input[@placeholder=\"First name\"]"));
	
        System.out.println(domattri.getDomAttribute("tabindex"));
        
   // it is use to find the index number of the tab
	

}
}