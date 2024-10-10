package PopupS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload_with_popup {

public static void main(String[]args) {
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
	WebElement file=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		
	//file.sendKeys("\"C:\\Users\\atris\\Downloads\\PopSAlrt UploadFile2024-03-15 151859.mp4\"");
	
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	//not done
	
	
}
}