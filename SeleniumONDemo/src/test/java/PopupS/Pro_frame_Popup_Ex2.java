package PopupS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pro_frame_Popup_Ex2 {

	public static void main(String[]args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hello");
		
		
		
		
		
	}
	
	
}
