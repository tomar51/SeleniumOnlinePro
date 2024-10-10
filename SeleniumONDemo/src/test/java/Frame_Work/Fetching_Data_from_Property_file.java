package Frame_Work;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fetching_Data_from_Property_file {
	
public static void main(String[]args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		
		// simple approach 
		
		/*driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("btn_action")).click();*/
		
		
		//step :- connect the file to the testscript
		
		// from desktop fetch with that file path
		
	//FileInputStream	fil= new FileInputStream("C:\\Users\\atris\\Desktop\\New folder\\Propertie file .properties");
		
		//from eclipse property file with add in project
		
		FileInputStream	fil= new FileInputStream("./Propertie file .properties");

	Properties pro = new Properties();	
	pro.load(fil);
	String URl = pro.getProperty("url");
	String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");	
	
	driver.get(URl);
	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	
	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	
	driver.findElement(By.className("btn_action")).click();
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	}

}



