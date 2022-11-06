package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctors_task {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
	WebElement email = driver.findElement(By.id("username"));
	email.sendKeys("yaminimohan");
	
       WebElement pass = driver.findElement(By.name("password"));
       pass.sendKeys("735833");
       
     WebElement log = driver.findElement(By.name("             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \""));
	log.click();
		
		
		
	}

}
