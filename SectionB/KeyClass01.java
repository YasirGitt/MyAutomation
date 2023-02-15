package SectionB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClass01 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement ele=driver.findElement(By.name("username"));
		ele.sendKeys("Yasir rock",Keys.TAB,"Yasir",Keys.TAB,"raza",Keys.TAB,"raza@gmail.com",Keys.TAB,Keys.ENTER,Keys.DOWN,Keys.ENTER,Keys.TAB,"123456");
		
	
		
		
	
	}

}
