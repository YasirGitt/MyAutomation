package SectionB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFlipkart {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor).driver;
		
		jse.executeScript(
		

		
	}

}
