package NewSection01;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Random11 {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
			
		WebElement ele=	driver.findElement(By.cssSelector("div[class='_3FdLqY']"));
			
		WebElement ele1=	driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/div"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDropBy(ele, 50, 0).perform();
		act.dragAndDropBy(ele1, -50, 0).perform();
	}

}
