package NewSection01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random4 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("nothing phone ",Keys.ENTER);
		
		
//		driver.findElement(By.id("gsr"));
		
//		Robot r= new Robot();
//		
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("Window.scollby(0,3000);");
		
		
		
		
	}

}
