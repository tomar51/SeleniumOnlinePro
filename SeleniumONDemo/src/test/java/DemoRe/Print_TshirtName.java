package DemoRe;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Print_TshirtName {
	
	public static void main(String[]args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("puma");
		
   List<WebElement> listele	=driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]/li"));
   
   for(WebElement listsho:listele) {
	   
	   
	   
   }
   
   
   
   
   
	}

}
