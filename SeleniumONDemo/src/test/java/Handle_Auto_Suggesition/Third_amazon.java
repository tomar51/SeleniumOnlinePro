package Handle_Auto_Suggesition;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

import org.openqa.selenium.By;


public class Third_amazon {
	
	public static void main(String[]args) throws Throwable {
		
	WebDriver driver =new EdgeDriver();
	
	driver.get("https://www.amazon.in");
	
	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("nike");
	
	Thread.sleep(2000);
	
	List<WebElement> listall= driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
	//for each loop
	
	for(WebElement list :listall) {
		
		Thread.sleep(1000);
		
		System.out.println(list.getText());
		
		if(list.getText().contains("nike shoes")) {
		
		list.click();
		}
		break;
		
		
		
	}
		
		
		// having doubt 
		
		
		
		
		
		
	}

}
