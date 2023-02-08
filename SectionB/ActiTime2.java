package SectionB;
// using keys class perform actitime
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {
	public static void main(String[] args) {
		 System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
			
			driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE);
			
	
	
}
}

