package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_project {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				
				
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
	s.sendKeys("iphone");
 driver.findElement(By.id("nav-search-submit-button")).click();
 
 
	Thread.sleep(2000);
// List<WebElement> c = 	driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
//for (WebElement web : c) {
//	String p = web.getText();
//	System.out.println(p);
	Thread.sleep(2000);

	driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).click();
   
WebElement g =	driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));

	}
	}


 
	


