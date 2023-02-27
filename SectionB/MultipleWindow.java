package SectionB;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindow {
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.zomato.com/india");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.swiggy.com/");
		
		Set<String> id= driver.getWindowHandles();
		
		for(String i: id) {
			
			String title=driver.switchTo().window(i).getTitle();
			
			if(title.contains("Google")) {
				
				break;
			}
			
		}
		driver.findElement(By.name("q")).sendKeys("alibaba movie",Keys.ENTER);
		
	WebElement ele=	driver.findElement(By.xpath("//span[text()='ALIBABA - Superhit Blockbuster Hindi Dubbed Full Action ...']"));
	
	Actions act= new Actions(driver);
	
	act.moveToElement(ele).click().build().perform();
	
	}

}
