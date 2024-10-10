package PopupS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Pro_frame_Popup_Ex3 {

		public static void main(String[]args) {
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/frames");
			
			driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
			
		WebElement topframe =driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}