package SectionB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse3 {
	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement ele1=driver.findElement(By.name("q"));
		ele1.sendKeys("iphone");
		
		WebElement ele=driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions act= new Actions(driver);
		
		act.doubleClick(ele1);
		
		Thread.sleep(3000);
		act.moveToElement(ele).doubleClick().build().perform();
	}

}
