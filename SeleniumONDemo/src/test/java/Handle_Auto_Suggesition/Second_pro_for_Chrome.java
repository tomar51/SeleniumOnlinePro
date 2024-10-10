package Handle_Auto_Suggesition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Second_pro_for_Chrome {
	
	public static void main(String[]args) throws Throwable {
		
	WebDriver driver= new EdgeDriver();
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("selenium");
	
	Thread.sleep(2000);
	
	////ul[@class=\"G43f7e\"]/li (parent element to child element)(/li) =>child
	
	List<WebElement> goog =driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
	
	for(WebElement sug :goog) {
		
		Thread.sleep(1000);
		
		System.out.println(sug.getText());
		
		if(sug.getText().contains("selenium")) {
			
			sug.click();
			
			break;
		}
	}
	
	
	
	
		
	}
	
	

}







     //for amazon
//div[@class="s-suggestion s-suggestion-ellipsis-direction"] 