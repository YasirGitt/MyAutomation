package NewSection01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRTCTC {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
				
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("uyyhg",Keys.TAB,"yjk989");

				
	}

}
