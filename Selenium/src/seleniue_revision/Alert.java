package seleniue_revision;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://demoqa.com/alerts");
		  // driver.manage().window().maximize();
		  // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		   
		   driver.findElement(By.id("alertButton")).click();
		   driver.switchTo().alert().accept();
		   
		  
//		   driver.findElement(By.id("timerAlertButton")).click();
//		   driver.switchTo().alert().accept();
//		   
		   driver.findElement(By.id("confirmButton")).click();
		   driver.switchTo().alert().dismiss();
		   
		   driver.findElement(By.id("promtButton")).click();
		   driver.switchTo().alert().sendKeys("you can");
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();
		   
		   
	}

}
