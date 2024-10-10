package Handle_Svg_html_tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Svg_tag {
	
	public static void main(String[]args) {
		
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.kayak.co.in/");
	
	//svg syntax:-
	
	//*[name()="svg" and @AttributeName="AttributeValue"]
	
	
  driver.findElement(By.xpath("//*[name()=\"svg\"and@class=\"dJtn-menu-item-icon\"]")).click();
}
}

     // Done 