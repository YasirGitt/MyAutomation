package Section2;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {
		public static void main(String[] args) {
			Random r= new Random();
			int data=r.nextInt();
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			
			driver.findElement(By.name("firstName")).sendKeys("Yasir");
			driver.findElement(By.name("lastName")).sendKeys("raza");
			
			driver.findElement(By.name("phone")).sendKeys("738378379");
			
			driver.findElement(By.id("userName")).sendKeys("scoout@gmail.com");
			driver.findElement(By.name("city")).sendKeys("panjagutta");
			driver.findElement(By.name("address1")).sendKeys("panjagutta");
			
			driver.findElement(By.name("state")).sendKeys("hyderabad");
			driver.findElement(By.name("postalCode")).sendKeys("820087");
			driver.findElement(By.name("country")).sendKeys("ALBANIA");
			
			driver.findElement(By.id("email")).sendKeys("Yahoo"+data);
			driver.findElement(By.name("password")).sendKeys("Rocking");
			driver.findElement(By.name("confirmPassword")).sendKeys("Rocking");
			driver.findElement(By.name("submit")).click();
			
	}

}
