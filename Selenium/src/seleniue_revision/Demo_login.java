package seleniue_revision;






import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_login {
	
	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", 
	    		"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    close.click();
	    
	    WebElement fas = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(fas).build().perform();
	    
	    
	    
	    
	    
	    
	    
	   /* List<WebElement> elements = driver.findElements(By.name("name"));
	    
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	    	
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	    }
	 */ }

       
}
	
	
	
	
	
	
	


