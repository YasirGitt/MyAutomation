package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com/");
		driver.get("https://www.Youtube.com");
		driver.get("https://www.youtube.com/@mytripcart");
		driver.findElement(By.xpath("//div[text()='Videos']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("flipkart");
		driver.findElement(By.xpath("//button[@jsname='ZUkOIc']")).click();
		driver.findElement(By.xpath("//input[@name='btnK' and @type]")).click();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("table");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='L0Z3Pu']")).click();
		
		
		}

}
