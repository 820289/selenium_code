package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		WebElement sign = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		sign.click();

		Thread.sleep(3000);

		WebElement first = driver.findElement(By.xpath("(//input[@name='firstname'])"));
		first.sendKeys("yamini");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("mohan");

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("yaminimohan@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("yamini1707");

		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByValue("17");

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByIndex(6);

		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1997");

		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		female.click();

	}

}
