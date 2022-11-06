package selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrive {

	public static void main(String[] args) { // Browser Launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // upcasting

		driver.get("https://www.flipkart.com/");

		//String title = driver.getTitle();
		//System.out.println(title);

		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);

		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);

//Navigate method

		driver.navigate().to("https://www.facebook.com/");

		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();

//manage 

		//driver.close();
		//driver.manage().window().maximize();
		//driver.quit();

	}

}
