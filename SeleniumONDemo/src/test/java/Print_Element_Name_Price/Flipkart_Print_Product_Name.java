package Print_Element_Name_Price;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Print_Product_Name {
	
	public static void main(String[]args) throws Throwable {
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("puma tshirt");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	// print tshirt name with using for each loop and list	
		
		List<WebElement> Tshirtname = driver.findElements(By.xpath("//div[@class=\"_2WkVRV\"]"));
		
		
		for(WebElement tshirtn:Tshirtname) {
			
			Thread.sleep(1000);
			System.out.println(tshirtn.getText());
			
		}
		
// print tshirt price with using for loop
		
	/*	List<WebElement> Tshirtprice=driver.findElements(By.xpath(" //div[@class=\"_30jeq3\"]"));
		
			for(WebElement Tshirtpri:Tshirtprice) {
				
				Thread.sleep(1000);
				System.out.println(Tshirtpri.getText());
			
					}*/
			
		 
		
		
		
		
		
	}

}


    //   //div[@class=\"_30jeq3\"]  for price