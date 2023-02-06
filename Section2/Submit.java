package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("ipone 12 pro");
		ele.submit();
		
	}

}
