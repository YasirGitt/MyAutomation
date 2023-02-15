package SectionB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse5 {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
	
		WebElement src=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement dest=driver.findElement(By.xpath("//p[text()='Dropped!']"));
		
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		
		act.dragAndDrop(src, dest).perform();
	}

}
