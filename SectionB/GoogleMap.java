package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/maps/@17.432576,78.462976,12z");
		
		driver.findElement(By.cssSelector("img[class='eYqqWd']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Choose starting point, or click on the map...']")).sendKeys("hyderabad",Keys.TAB,"goa",Keys.ENTER);
		
	}
}
