package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		// driver.findElement(By.cssSelector("input#email")).sendKeys("yaminimohan1998@gmail.com");
		// //locate ID
		// driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("yamini44");
		// // locate Name
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("yamini98");
		// driver.findElement(By.cssSelector("[type^='p']")).sendKeys("12354"); //locate
		// prefix
		// driver.findElement(By.cssSelector("[id$='l']")).sendKeys("yaminimohan34@gmail.com");
		// //locate suffix

		driver.findElement(By.cssSelector("[placeholder*=\"one\"]")).sendKeys("9845625863"); // contains substring

	}

}
