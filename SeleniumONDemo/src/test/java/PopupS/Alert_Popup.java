package PopupS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Popup {
	

	public static void main(String[]args) {
		
	WebDriver driver= new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
	Alert alt = driver.switchTo().alert();
	
	alt.accept();*/

	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	
	Alert alt = driver.switchTo().alert();

	//alt.dismiss();
	
	// for print popup text
	
	String text = alt.getText();
	
	System.out.println(text);
	}

}
