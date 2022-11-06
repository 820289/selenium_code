package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.get("https://demoqa.com/buttons");
		//driver.manage().window().maximize();
		
		
//		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
//
//		Actions ac = new Actions(driver);
//		ac.click(click).build().perform();
//
//		WebElement right = driver.findElement(By.id("rightClickBtn"));
//		ac.contextClick(right).build().perform();
//
//		WebElement d = driver.findElement(By.id("doubleClickBtn"));
//		ac.doubleClick(d).build().perform();
//
//		driver.get("http://www.leafground.com/pages/drop.html");
//
//		WebElement drag = driver.findElement(By.id("draggable"));
//
//		WebElement drop = driver.findElement(By.id("droppable"));
//		Actions as = new Actions(driver);
//		as.dragAndDrop(drag, drop).build().perform();
		
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement dr = driver.findElement(By.id("draggable"));
		Actions S = new Actions(driver);
		S.clickAndHold(dr).build().perform();
		S.moveToElement(dr, 250, 0).build().perform();
		

	}

}
