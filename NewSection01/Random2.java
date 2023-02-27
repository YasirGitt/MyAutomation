package NewSection01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/nestedframes");
	WebElement ele=	driver.findElement(By.id("frame1"));
		driver.switchTo().frame(ele).switchTo().frame(0);
		
		String name= driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(name);
		
	}

}
