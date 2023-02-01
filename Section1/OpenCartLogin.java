package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Yasir");
	
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Raza");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("Razayasir2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='input-newsletter-yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
