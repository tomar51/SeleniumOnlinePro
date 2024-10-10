package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAriaRole_14 {
	
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
	//getAriaRole method 	
		
   WebElement getAriaro =driver.findElement(By.name("firstname"));
   
        System.out.println(getAriaro.getAriaRole());

}
}