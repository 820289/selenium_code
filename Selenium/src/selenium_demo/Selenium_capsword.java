package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_capsword {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		  WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
		   Actions ac = new Actions(driver);
		   
		   //Robot
		   //keypress
		   //keyrelease
		   
		   //Action
		   //keydown
		   //keyup
		
		  ac.keyDown(ser, Keys.SHIFT).sendKeys("womendress").keyUp(ser, Keys.SHIFT).build().perform();
	}

}
