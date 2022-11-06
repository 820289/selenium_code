package selenium_demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("yaminimohan97@gmail.com");

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("8565489");

		WebElement log = driver.findElement(By.name("login"));
		log.click();
 
       Thread.sleep(3000);		
		TakesScreenshot s = (TakesScreenshot) driver; // Type casting - Narrowing
		File s1 = s.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\Screenshot\\login.png");
		
		FileUtils.copyFile(s1, f);
		
	}

}



