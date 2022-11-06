package seleniue_revision;





import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandlingamazon {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String oldwindowHandle = driver.getWindowHandle();
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions ref = new Actions(driver);
		ref.contextClick(mob).build().perform();
		
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> Handles = driver.getWindowHandles();
		
		for (String newwindow : Handles) {
			
			driver.switchTo().window(newwindow);
			
		}
            WebElement smart = driver.findElement(By.xpath("//*[@id=\"sobe_d_b_2_1\"]/a/div[1]/img"));
            smart.click();
            
	}
	

	}		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement know = driver.findElement(By.xpath("//img[@alt='Know more']"));
//		know.click();
//		driver.close();
//		
//		driver.switchTo().window(oldwindowHandle);
//		
//		WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
//		bestseller.click();
	
