package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePick {
	public static void main(String[] args) {
System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		
//		driver.findElement(By.id("datepicker")).click();
//		
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='24']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("03/04/23",Keys.ESCAPE);
	}

}
