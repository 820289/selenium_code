package seleniue_revision;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\drivernew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_d")).getText();
		driver.findElement(By.name("btnK")).getText();
		driver.findElement(By.linkText("About")).getText();
		driver.findElement(By.partialLinkText("Busi")).getText();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name=\"btnI\"]")).getText();
		driver.findElement(By.id("latest-query")).getText();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[value=\"Google Search\"]")).getText();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("count " +list.size());
		
		
	}

}
