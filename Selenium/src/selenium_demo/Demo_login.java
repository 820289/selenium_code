package selenium_demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_login {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

//WebElement newreg = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		// newreg.click();

		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("Yaminimohan");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("yamini@97");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		Thread.sleep(3000);
		WebElement loc = driver.findElement(By.name("location"));
		Select s = new Select(loc);
		s.selectByValue("London");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);

		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByVisibleText("Standard");

		WebElement numbroom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(numbroom);
		s3.selectByIndex(2);

		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("5/7/2022");

		WebElement out = driver.findElement(By.id("datepick_out"));
		out.clear();
		out.sendKeys("6/7/2022");

		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s6 = new Select(adult);
		s6.selectByIndex(2);

		WebElement child = driver.findElement(By.id("child_room"));
		Select s7 = new Select(child);
		s7.selectByIndex(1);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		WebElement clik = driver.findElement(By.name("radiobutton_0"));
		clik.click();

		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();

		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("yamini");

		WebElement last = driver.findElement(By.name("last_name"));
		last.sendKeys("mohan");

		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("no.6 rose street anna nagar, chennai 58");

		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("1278456247854235");

		WebElement type = driver.findElement(By.id("cc_type"));
		Select s8 = new Select(type);
		s8.selectByValue("VISA");

		WebElement mnth = driver.findElement(By.id("cc_exp_month"));
		Select s9 = new Select(mnth);
		s9.selectByVisibleText("October");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s10 = new Select(year);
		s10.selectByVisibleText("2022");

		WebElement cv = driver.findElement(By.name("cc_cvv"));
		cv.sendKeys("456");

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		TakesScreenshot S = (TakesScreenshot)driver;
		File S1 = S.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\Screenshot\\red.png");
	FileUtils.copyFile(S1, f);
	
	System.out.println("Over");

	}

}
