package selenium_demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\newch\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement cus = driver.findElement(By.xpath("//a[text()='Customer Service'][1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(cus).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement fas = driver.findElement(By.xpath("//a[text()='Fashion']"));
		ac.contextClick(fas).build().perform();

		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		Set<String> win = driver.getWindowHandles();
// System.out.println(win);
//String title = driver.switchTo().window("CDwindow-EEBA7484DE52C524ACF4C337D12ED15E").getTitle();
// System.out.println(title);

		for (String s : win) {
			String t = driver.switchTo().window(s).getTitle();
			System.out.println(t);

		}

	}

}
