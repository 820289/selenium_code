package seleniue_revision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demoqa.com/upload-download");
	   
	  WebElement upload = driver.findElement(By.id("uploadFile"));
	  upload.click();
	   Thread.sleep(2000);
	   String file = "sampleFile";
	   
	   StringSelection selection = new StringSelection(file);
	   
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); 
	  
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
