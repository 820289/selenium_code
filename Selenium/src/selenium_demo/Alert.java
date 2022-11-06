package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement c = driver.findElement(By.xpath("//button[@id='alertButton']"));
		c.click();

		driver.switchTo().alert().accept();


		WebElement co = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		co.click();

		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@id='promtButton']")).click();

		driver.switchTo().alert().sendKeys("yamini");

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

	}

}
