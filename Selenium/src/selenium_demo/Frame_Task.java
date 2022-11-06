package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Task {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
	
	
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	
	driver.switchTo().defaultContent();
	
	
	
	
	
	}

}
