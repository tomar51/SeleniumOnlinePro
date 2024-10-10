package PopupS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Send_value_in_PopUp {
	
	public static void main(String[]args) {
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("hello");
		alt.accept();
		

}
}