package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidingP {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
	WebElement ele=	driver.findElement(By.xpath("//span[@style='left: 0%;']"));
	Thread.sleep(3000);
	Actions act= new Actions(driver);
	
	act.dragAndDropBy(ele, 50, 0).perform();
	
	
	}

}
