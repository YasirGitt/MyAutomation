package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		String title= driver.getTitle();
		System.out.println("Title: "+title);
		
		String url= driver.getCurrentUrl();
		System.out.println("Url: "+url);
		
		WebElement e1= driver.findElement(By.name("username"));
		e1.sendKeys("QSP");
		
		WebElement e2= driver.findElement(By.name("firstname"));
		e2.sendKeys("Yasir");
		
		WebElement e3= driver.findElement(By.name("lastname"));
		e3.sendKeys("raza");
		
		WebElement e4= driver.findElement(By.name("email"));
		e4.sendKeys("razayasir2@gmail.com");
		
		WebElement e6= driver.findElement(By.id("input-country"));
		e6.sendKeys("Albania");
		
		WebElement e5= driver.findElement(By.name("password"));
		e5.sendKeys("12345678");
		
		
		
		
	}

}
