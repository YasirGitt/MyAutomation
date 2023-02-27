package Section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesActiTime {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Propetiesfile\\Act.PROPERTIES");
		Properties p= new Properties();
		
		p.load(fis);
		
	String Url=	p.getProperty("url");
	System.out.println(Url);
	
String un=	p.getProperty("un");
	System.out.println(un);
String pwd=	p.getProperty("pwd");
	System.out.println(pwd);
		
	driver.get(Url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
