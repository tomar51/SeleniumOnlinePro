package Handle_Multiple_WebElements_findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_findElements {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
	List <WebElement> alllink =driver.findElements(By.xpath("//a"));
	
    int count =0;
    for(WebElement link : alllink) {
    	
    //	for all test print
    	
    	//System.out.println(link.getText());
    	
    	Thread.sleep(1000);
    	
    	System.out.println(link.getAttribute("href"));
    	
    }
    System.out.println("total num of links :" +count);
}
}           
           // Done 
