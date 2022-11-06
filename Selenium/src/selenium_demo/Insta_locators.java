package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_locators {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
		
	WebElement username =	driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("yamini");
	
 WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
 pass.sendKeys("yamini97");
 
        WebElement log = driver.findElement(By.xpath("//div[text ()='Log In']"));
        log.click();
 
	}

}
