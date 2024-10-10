package WebElement_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSize_method_7 {

	public static void main(String[]args) {
		
	WebDriver driver =new FirefoxDriver();
	
	driver.get("https://www.amazon.in");
		
	//method 7: getSize()
	
	WebElement size =driver.findElement(By.xpath("//a[text()=\"Best Sellers\"]"));
	
	//for total size together 
	
	System.out.println(size.getSize());	
	
	//for different different size
	
	Dimension HeWi= size.getSize();
	
	System.out.println(HeWi.getHeight());
	System.out.println(HeWi.getWidth());
		
		
		
		
		
		
		
		
	}

}
