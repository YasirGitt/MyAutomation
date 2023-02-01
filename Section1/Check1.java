package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check1 {
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chromedriver.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("wiki");
		driver.findElement(By.name("btnK")).click();
		

		
	}
}