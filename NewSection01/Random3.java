package NewSection01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		
        driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
	String ele1=driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
		System.out.println(ele1);
		
		
	}

}
