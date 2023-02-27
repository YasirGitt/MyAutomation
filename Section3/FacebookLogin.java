package Section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    FileInputStream fs= new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Propetiesfile\\Facebook.PROPERTIES");
	    
	    Properties p= new Properties();
	    p.load(fs);
	 String un=p.getProperty("un");
	    String pwd=p.getProperty("pwd");
	    String url=p.getProperty("url");
	    
	    System.out.println(un);
	    System.out.println(pwd);
	    System.out.println(url);
	    
	    driver.get(url);
	    driver.findElement(By.id("email")).sendKeys(un);
	    driver.findElement(By.id("pass")).sendKeys(pwd);
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
		
	}

}
