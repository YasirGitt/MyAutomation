package SectionB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse6 {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement ele1=driver.findElement(By.name("q"));
			ele1.sendKeys("iphone");
			ele1.submit();
			
			Thread.sleep(3000);
			WebElement ele=driver.findElement(By.className("_3FdLqY"));
			WebElement ele2=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/div"));
			Thread.sleep(3000);
			Actions act= new Actions(driver);
			
			act.dragAndDropBy(ele, 50,0).perform();
			
			Thread.sleep(3000);
			act.dragAndDropBy(ele2, -50, 0).perform();
		
	}

}
