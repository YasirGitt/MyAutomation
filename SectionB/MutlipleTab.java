package SectionB;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleTab {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 14",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		
		String mainId=driver.getWindowHandle();
	Set<String> allId = driver.getWindowHandles();
	
	System.out.println(mainId);
	System.out.println(allId);
	
	for(String i: allId) {
		
		if(!mainId.equals(i)) {
			
			driver.switchTo().window(i);
		}
	}
	
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				
	}

}
