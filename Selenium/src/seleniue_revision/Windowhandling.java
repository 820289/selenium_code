package seleniue_revision;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	
	String oldwindow = driver.getWindowHandle();           //current win
	System.out.println(oldwindow);                         //get the id of current win

	WebElement f1w = driver.findElement(By.id("button1"));      //take xpath of current win
	f1w.click();
	
	Set<String> handles =driver.getWindowHandles();             //to perform multiple win
	
	for (String newwindow : handles) {                         //to use for perform new win element. 
		
		driver.switchTo().window(newwindow);                 // switch to new win
	}	
		WebElement wel =  driver.findElement(By.xpath("//*[@id=\"site-header-inner\"]/div[3]/a/span[1]"));
		wel.click();                               
		System.out.println("end");
		
		driver.close();
		System.out.println("new win closed");
		
		driver.switchTo().window(oldwindow);
		
	WebElement nextwin = driver.findElement(By.xpath("//button[@name='newmessagewindow321']"));
	nextwin.click();
	
	int noofwindow = driver.getWindowHandles().size();
	System.out.println(noofwindow);
	driver.close();
	
	//driver.switchTo().window(oldwindow);
	
	WebElement lastwin = driver.findElement(By.id("button1"));
	lastwin.click();
	
	Set<String> last = driver.getWindowHandles();
	
	for (String lastwindow : handles) {
		
		if (!lastwindow.equals(oldwindow)) {
			driver.switchTo().window(lastwindow);
			driver.close();
			
		}
		
	}
	
	
		
	}
   

}
