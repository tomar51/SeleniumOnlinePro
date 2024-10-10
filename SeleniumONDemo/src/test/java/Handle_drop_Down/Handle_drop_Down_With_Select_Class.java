package Handle_drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_drop_Down_With_Select_Class {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		WebElement daylist =driver.findElement(By.id("day"));
		
		Select sel =new Select(daylist);
		
		  //sel.selectByIndex(16);
		
	// select by value
		
		 //sel.selectByValue("17");
		
 // select by visible text
		 
		sel.selectByVisibleText("21");
		
		
		Thread.sleep(1000);
		
		WebElement monthlist =driver.findElement(By.id("month"));
		
		Select sele= new Select(monthlist);
		
		//sele.selectByIndex(0);
		
		// select by value
		
		sele.selectByValue("12");
		
 
		
		Thread.sleep(1000);
		
		WebElement yearlist =driver.findElement(By.id("year"));
		
		Select selyer= new Select(yearlist);
		
		//selyer.selectByIndex(3);

       selyer.selectByValue("1997");


}
}