package SectionB;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']/following-sibling::div/input")).sendKeys("James",Keys.TAB,Keys.DOWN,Keys.ENTER,Keys.TAB,"karuna sri bale",Keys.ENTER,Keys.TAB,Keys.DOWN,Keys.ENTER,Keys.ESCAPE);
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("James",Keys.TAB,"Jam007",Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,"Linda anderson",Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.TAB);
		
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd'][1]")).sendKeys("2023-02-25",Keys.TAB,"2023-02-28",Keys.TAB,Keys.DOWN,Keys.ENTER,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER,Keys.TAB,"pooja karnik",Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER,Keys.TAB,Keys.SPACE);

		
		//driver.findElement(By.xpath("//div[text()='Select']")).click();
		
		
		
		
		
		
		
		


	
	}

}
