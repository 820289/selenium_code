package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.w3schools.com/html/html_tables.asp");
		    driver.manage().window().maximize();
	
//	   List<WebElement> f  = driver.findElements(By.xpath("//table[@id='customers']/tbody"));
//	   for (WebElement yam : f) {
//		System.out.println(yam.getText());    // all table
		    
		   
		  List<WebElement> f = driver.findElements(By.tagName("th"));
   for (WebElement webElement : f) {
		   System.out.println(webElement.getText());		
		    
		   
		    
		}
//		
	}
}
	
	


