package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14 pro");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).click();
//		String data=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).getText();
//		System.out.println(data);
//		
//		String dat= driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']/../following-sibling::div/div/div/div")).getText();
//		System.out.println(dat);
		
		driver.findElement(By.xpath("//div[text()='₹1,35,990']/../../../preceding-sibling::div/div")).click();
		
	}

}
