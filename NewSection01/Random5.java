package NewSection01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Random5 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		TakesScreenshot sh=(TakesScreenshot)driver;
		
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot\\p8.png");
		Files.copy(src, dist);
		
		driver.findElement(By.name("")).sendKeys("nothing");

	}

}
