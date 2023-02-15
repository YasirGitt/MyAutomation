package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FClear {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement ele=driver.findElement(By.name("firstName"));
		ele.sendKeys("Yasir");
		
		WebElement ele1=driver.findElement(By.name("lastName"));
		ele1.sendKeys("raza");
		
		WebElement ele2=driver.findElement(By.name("phone"));
		ele2.sendKeys("738378379");
		
		WebElement ele3=driver.findElement(By.id("userName"));
		ele3.sendKeys("scoout@gmail.com");
		
		WebElement ele4=driver.findElement(By.name("city"));
		ele4.sendKeys("panjagutta");
		
		WebElement ele5=driver.findElement(By.name("address1"));
		ele5.sendKeys("panjagutta");
		
		WebElement ele6=driver.findElement(By.name("state"));
		ele6.sendKeys("hyderabad");
		
		WebElement ele7=driver.findElement(By.name("postalCode"));
		ele7.sendKeys("820087");
		
		WebElement ele8=driver.findElement(By.name("country"));
		ele8.sendKeys("ALBANIA");
		
		Thread.sleep(2000);
		ele.clear();
		ele1.clear();
		ele2.clear();
		ele3.clear();
		ele4.clear();
		ele5.clear();
		ele6.clear();
		ele7.clear();
	
		
		
	
	}

}
