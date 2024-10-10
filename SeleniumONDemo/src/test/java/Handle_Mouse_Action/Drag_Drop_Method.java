package Handle_Mouse_Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Method {
	
	public static void main(String[]args) {
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag =driver.findElement(By.id("draggable"));
		
		WebElement drop =driver.findElement(By.id("droppable"));

		Actions act= new Actions(driver);
		
		/*act.clickAndHold(drag).perform();
		
		act.release(drop).perform();*/
		
		      //OR
		
	//	act.dragAndDrop(drag, drop).perform();
		
		  //OR
		
		act.clickAndHold(drag).release(drop).perform();
		
		
		
		
		
	}

}
