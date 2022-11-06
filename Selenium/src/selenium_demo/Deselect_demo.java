package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Deselect_demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
	WebElement sel = driver.findElement(By.xpath("(//select)[6]"));
	Select S = new Select(sel);
	S.selectByIndex(1);
	S.selectByValue("2");
	S.selectByVisibleText("UFT/QTP");
	//S.deselectAll();
	//S.deselectByValue("2");
	//S.deselectByVisibleText("UFT/QTP");
	
	S.deselectByIndex(1);
	Boolean m 	= S.isMultiple();
	System.out.println(m);
	
	List<WebElement> opt  = S.getOptions();
	for (int i = 0; i < opt.size(); i++) {
		System.out.println(opt.get(i).getText());
	}	

	List<WebElement> all =	S.getAllSelectedOptions();
 for (WebElement a : all) {
	  System.out.println(a.getText());
	  
 }
	  
	 WebElement first =  S.getFirstSelectedOption();
	 System.out.println(first.getText());
	  
	  
	
}
 
	
	}
		
	
	


 

	
 
	


