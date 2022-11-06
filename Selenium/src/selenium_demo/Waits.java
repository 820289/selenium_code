package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);    //implicit waits
		//Thread.sleep(5000);
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("yaminimoh@gmail.com");
	
	WebDriverWait wait = new WebDriverWait(driver, 10);     //explicit waits
	wait.until(ExpectedConditions.visibilityOf(email));
	
	 WebElement pass =  driver.findElement(By.id("pass"));
	 pass.sendKeys("yamini58");
	}

}
