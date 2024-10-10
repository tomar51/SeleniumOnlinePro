package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToDisplayed_method_9 {
	
	public static void main(String[]args) {
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
	WebElement dislogo =	driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
		
	if(dislogo.isDisplayed()) {
		
		System.out.println("logo is present");
	}
	else {
		System.out.println("logo not present");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
