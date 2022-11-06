package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", 
				
				
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\drivernew\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
WebElement find = driver.findElement(By.name("//input[@name=\"q\"]"));
System.out.println("name is " + find.getAttribute("name"));
	
	
	
	
	}

}
