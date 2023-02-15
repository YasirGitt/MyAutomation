package SectionB;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.naukri.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
			
			
			  WebElement ele=driver.findElement(By.xpath("//div[text()='Jobs']"));
			  
			  Actions act= new Actions(driver);
			  
			  act.moveToElement(ele).perform();
			  
			  driver.findElement(By.xpath("//div[text()='Fresher jobs']")).click();
			
			  List<WebElement> ele2=driver.findElements(By.xpath("//div[@class='top-ctg-jobs-tuple-cont swiper-wrapper']/div"));
			  
			  for(WebElement h: ele2) {
			  
			  String data=h.getText();
			  
			  System.out.println(data); }
			 
	}

}
