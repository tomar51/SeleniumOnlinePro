package HandleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_window_with_title {
	
public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		
driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

 Set<String> allWins =driver.getWindowHandles();
 
 for(String win :allWins) {
	 
	 driver.switchTo().window(win);
	 
 }







}
}