package WebElement_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCssValue_Method_5 {
	
	public static void main(String[]args) {
		
	WebDriver driver= new EdgeDriver();
	
	driver.get("https://www.amazon.in");
	
	//method 5: getCssValue()
	
	WebElement variable=driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"))	;
		
	System.out.println(variable.getCssValue("color"));	
		
		
		
		
		
		
		
	}

}
