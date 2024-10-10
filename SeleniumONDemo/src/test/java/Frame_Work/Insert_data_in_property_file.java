package Frame_Work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class Insert_data_in_property_file {
	
	public static void main(String[]args) throws Throwable {
	
	//inserting data to properties file
	
	Properties pro = new Properties();
	pro.setProperty("url", "https://www.saucedemo.com/v1/");
	pro.setProperty("username", "standard_user");
	pro.setProperty("password", "secret_sauce");
	
	FileOutputStream filso = new FileOutputStream("./Propertie file .properties");
     pro.store(filso, "CommmonData");
     
     // fetch the data
     
     // need to do 
     
     WebDriver driver = new EdgeDriver();
     
     driver.manage().window().maximize();
     
     FileInputStream	fil= new FileInputStream("./Propertie file .properties");

 	Properties profetch = new Properties();	
 	pro.load(fil);
 	String URl = profetch.getProperty("url");
 	String USERNAME = profetch.getProperty("username");
 	String PASSWORD = profetch.getProperty("password");	
 	
 	driver.get(URl);
 	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
 	
 	driver.findElement(By.id("password")).sendKeys(PASSWORD);
 	
 	driver.findElement(By.className("btn_action")).click();
 	
}
}