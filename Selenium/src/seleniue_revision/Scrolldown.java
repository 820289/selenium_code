package seleniue_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	
	JavascriptExecutor sroll = (JavascriptExecutor)driver;
	   sroll.executeScript("window.scroll(0,6000)");
	   
	   
	   
	   	       
	
	
	
	}

}
