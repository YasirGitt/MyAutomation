package NewSection01;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateTime02 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.timeanddate.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Calculators']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Date to Date Calculator (duration)']")).click();
		driver.findElement(By.name("d1")).sendKeys("11",Keys.TAB,"05",Keys.TAB,"1996");
		driver.findElement(By.id("d2")).sendKeys("24",Keys.TAB,"02",Keys.TAB,"2023");
		driver.findElement(By.id("subbut2")).click();
	String data=	driver.findElement(By.xpath("//h2[text()='Result: 9785 days']")).getText();
	System.out.println(data);
		

		
		
		
		
	}

	
}
