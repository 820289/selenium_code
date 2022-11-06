package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ab {
      public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", 
			   "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Selenium\\\\newch\\\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	   //driver.findElement(By.xpath("/html/body/div/header/div/div[5]/div[2]/div/div/a[5]")).click();
	   //driver.findElement(By.xpath("/html/body/div/header/div/div[5]/div[2]/div/div/a[2]")).click();
	   
	   driver.findElement(By.xpath("/html/body/div/header/div/div[5]/div[2]/div/div/a[3]")).click();
	   
	}
}
