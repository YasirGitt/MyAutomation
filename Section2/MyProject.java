package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProject {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("mytripcart");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Mytripcart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tp-yt-paper-tab[@class='style-scope ytd-c4-tabbed-header-renderer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Beautiful Destination The Albert Museum Jaipur Rajasthan']")).click();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
//		Thread.sleep(5000);
//		driver.close();
	}

}
