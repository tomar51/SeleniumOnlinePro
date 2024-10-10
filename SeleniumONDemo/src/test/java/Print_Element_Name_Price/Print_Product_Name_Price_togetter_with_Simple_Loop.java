package Print_Element_Name_Price;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Product_Name_Price_togetter_with_Simple_Loop {
	
	public static void main(String[]args) {
		
	WebDriver driver =new ChromeDriver();
	 
	driver.get("https://www.flipkart.com");
	
	driver.findElement(By.name("q")).sendKeys("puma tshirt");
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	
 List<WebElement> Tshirtname = driver.findElements(By.xpath("//div[@class=\"_2WkVRV\"]"));
			
 List<WebElement> Tshirtprice=driver.findElements(By.xpath(" //div[@class=\"_30jeq3\"]"));

	for(int i=0;i<Tshirtname.size();i++) {
		
		System.out.println(Tshirtname.get(i).getText() + "----" + Tshirtprice.get(i).getText());
		
		
	}
		
		
		
		
	}

}
