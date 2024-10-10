package Handle_Auto_Suggesition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Pro {
	
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();	
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("puma");
		
		Thread.sleep(2000);
		
 List<WebElement> allList =driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]/li"));
			
	for(WebElement list : allList )	{
		
		Thread.sleep(1000);
		System.out.println(list.getText());
		
		if (list.getText().contains("puma sandals")) {
			
			list.click();
			break;
		}
	}
			
    // try it in google chrome and amazon
}

}












