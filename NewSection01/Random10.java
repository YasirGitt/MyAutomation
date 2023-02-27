package NewSection01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Random10 {
	public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
			
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
			WebDriver driver= new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			
		WebElement ele=	driver.findElement(By.xpath("//a[text()='Images']"));
			Actions act= new Actions(driver);
			
			act.moveToElement(ele).contextClick().build().perform();
			
			Robot r= new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	}

}
