package Section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesHRM {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		FileInputStream f= new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Propetiesfile\\HRM.PROPERTIES");
		
		Properties p= new Properties();
		
		p.load(f);
		
	String url=	p.getProperty("url");
	String un= p.getProperty("un");
	String pwd= p.getProperty("pwd");
	
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			
	}

}
