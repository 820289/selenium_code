package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);  //use index to enter first frame.
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1); //parent frame & we used method overloading to pass arguments.
		driver.switchTo().frame(0);       //child frame
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		
		driver.findElement(By.xpath("//a[text()='Widgets']")).click();
		
		
		
	}

}
