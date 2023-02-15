package SectionB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseClass01 {
	
	public static void main(String[] args) throws AWTException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement ele=driver.findElement(By.name("username"));
		ele.sendKeys("Yasir raza");
		
		driver.findElement(By.name("firstname")).sendKeys("Yasir");
		
		driver.findElement(By.name("lastname")).sendKeys("Raza");
		
		driver.findElement(By.name("email")).sendKeys("raza@gmail.com");
		
		//WebElement ele2=driver.findElement(By.id("input-country"));
		
		driver.findElement(By.xpath("//option[text()='Hong Kong']")).click();
		
	
		// by using select class perform scenario..
		
//		Select s= new Select(ele2);
//		
//		s.selectByVisibleText("Algeria");
		
		// by using robot class perform scenario
		
//		Robot r= new Robot();
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
		
		
		
		
		
		
		
	}	

}
