package seleniue_revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement firstcol = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]"));
	    System.out.println(firstcol.getText());
	    
	    WebElement seventhro = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[2]"));
	    System.out.println(seventhro.getText());
	    
	    List<WebElement> company = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
    List<WebElement> contact = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
   for (int i = 0; i < company.size(); i++) {
	if (company.get(i).getText().equalsIgnoreCase("Microsoft")) {
		System.out.println(contact.get(i).getText());
		
	}
}
	    
	    
		}
		}
	
	
	
	


