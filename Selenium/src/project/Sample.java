package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\drivernew\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement fsname = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		fsname.sendKeys("Yamini");
		WebElement email = driver.findElement(By.xpath("//input[@name=\"login5c6b0862\"]"));
		email.sendKeys("yaminimohan1997@gmail.com");
	}

}
