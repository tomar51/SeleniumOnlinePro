package Locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_print_Price {
	

	public static void main(String[]args)throws Throwable  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@type=\"text\"and@name=\"q\"]")).sendKeys("adidas shoes");
		
      driver.findElement(By.xpath("//button[@type=\"submit\"and@aria-label=\"Search for Products, Brands and More\"]")).click();
      
      Thread.sleep(1000);
      
    /*  driver.findElement(By.xpath("//img[@class=\"_2r_T1I\"and@src=\"https://rukminim2.flixcart.com/image/612/612/xif0q/shoe/d/i/k/9-iu6373-9-adidas-cblack-grey-broyal-original-imagyag37aheg3ay.jpeg?q=70\"]")).click();
      
      Thread.sleep(1000);*/
      
   //find total number of the product 
      
     List<WebElement> print = driver.findElements(By.xpath("//img[@class=\"_2r_T1I\"]"));
   
     System.out.println("total number :" + print.size()); 
     
    
     
     
     
     
     
}
}