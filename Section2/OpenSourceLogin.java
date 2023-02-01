package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		
		WebElement ele2= driver.findElement(By.name("username"));
		ele2.sendKeys("Admin");
		Thread.sleep(1000);	
		WebElement ele3= driver.findElement(By.name("password"));
		ele3.sendKeys("admin123");
		Thread.sleep(1000);
		WebElement ele4= driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		ele4.click();
		
		
		
		
		
				
	}

}
