package NewSection01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random13 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.foundit.in/#");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.className("browse-text")).click();
		
		StringSelection s= new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot\\resume.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Thread.sleep(3000);
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
