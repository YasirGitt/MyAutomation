package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWaits {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
	
		
		WebElement ele2= driver.findElement(By.name("username"));
		ele2.sendKeys("Admin");
		
		WebElement ele3= driver.findElement(By.name("password"));
		ele3.sendKeys("admin123");
	
		WebElement ele4= driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		ele4.click();
	}

}
