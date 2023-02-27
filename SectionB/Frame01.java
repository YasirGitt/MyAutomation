package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		
		driver.switchTo().defaultContent();
		
//		Thread.sleep(3000);
		driver.switchTo().frame(2);
		
	    String name=driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
		
	    System.out.println(name);
		
		
		
	}

}
