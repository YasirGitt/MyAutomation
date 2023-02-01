package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-43")).click();
		Thread.sleep(1000);
		Navigation nav= driver.navigate();
		nav.back();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-20")).click();
		Thread.sleep(1000);
		nav.back();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-21")).click();
		Thread.sleep(1000);
		nav.back();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-19")).click();
		Thread.sleep(1000);
		nav.back();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-18")).click();
		Thread.sleep(1000);
		nav.back();
		driver.close();
		
		
	}

}
