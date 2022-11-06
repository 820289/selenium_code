package seleniue_revision;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		 //driver.findElement(By.xpath("//a[text()='This is a link']")).click();
		 //driver.close();
		 driver.findElement(By.id("fname")).sendKeys("Yamini M");
		 
		WebElement click = driver.findElement(By.xpath("//button[text()='Submit']"));
        Actions ac = new Actions(driver);
        ac.click(click).build().perform();
        
     WebElement dou = driver.findElement(By.xpath("//button[text()='Double-click to generate alert box']"));
		ac.doubleClick(dou).build().perform();
		
		WebElement fem = driver.findElement(By.id("female"));
		fem.click();
		
	WebElement aut = driver.findElement(By.xpath("//input[@value=\"Automation\"]"));
	ac.click(aut).build().perform();
	
	WebElement drop =  driver.findElement(By.xpath("//select[@id=\"testingDropdown\"]"));
	Select s = new Select(drop);
	s.selectByValue("3");
	
	
	}

}
