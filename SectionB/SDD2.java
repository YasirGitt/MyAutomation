package SectionB;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SDD2 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		Random r1= new Random();
		
		int in=r1.nextInt();
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		String url= driver.getCurrentUrl();
		String title=driver.getTitle();
		
		System.out.println(url+"        "+title);
		
		driver.findElement(By.id("input-username")).sendKeys(in+"Yasir");
		driver.findElement(By.id("input-firstname")).sendKeys("Yasir");
		driver.findElement(By.id("input-lastname")).sendKeys("raza");
		
		driver.findElement(By.id("input-email")).sendKeys("yasir@gmail.com");
		
		WebElement ele=driver.findElement(By.id("input-country"));
		ele.click();
		
		Select s= new Select(ele);
		
		s.selectByValue("99");
		
		ele.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("input-password")).sendKeys("123445");
		
	List<WebElement> ele1=driver.findElements(By.xpath("//select[@id='input-country']/option"));	
	
	for(int i=1; i<ele1.size(); i++) {
		
		String cname= ele1.get(i).getText();
		
		System.out.println(i+"        "+cname);
	}
		
		
	}

}
