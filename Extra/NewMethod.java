package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMethod {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		WebElement ele= driver.findElement(By.id("keepLoggedInCheckBox"));
		ele.click();
		
		if(ele.isSelected()) {
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("not selected");
		}
		if(ele.isEnabled()) {
			System.out.println("attribut Enabled");
		}
		else {
			System.out.println("attribute not Enabled");
		}
		if(ele.isDisplayed()) {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			Thread.sleep(5000);
			WebElement error = driver.findElement(By.className("errormsg"));
			if(error.isDisplayed()) {
				System.out.println("login failed");
			}
			else {
				System.out.println("loggin");
			}
			
			
		}
		
	
	
		}
}


