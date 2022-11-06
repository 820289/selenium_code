package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	WebElement SellonAmazon   = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
	js.executeScript("arguments[0].scrollIntoView();",SellonAmazon);  
	
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-2000);");  //scroll up
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1000);");  //scroll down
	
	Thread.sleep(2000);
   WebElement Signin = driver.findElement(By.xpath("//span[@class='action-inner']"));
   js.executeScript("arguments[0].click();",Signin);   //signin
   
   js.executeScript("alert('hello amazon');"); //Alert msg
   js.executeScript("history.go(0)");         // Refresh
   
  
 
 


	
	
	}

}
