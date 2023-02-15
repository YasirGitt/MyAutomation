package SectionB;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot01 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot sh=(TakesScreenshot)driver;
		
		File src=sh.getScreenshotAs(OutputType.FILE);
		
		File dist= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot\\p3.png");
		
		Files.copy(src, dist);
		

		
		driver.findElement(By.name("")).sendKeys("world list");
	}

}
