package NewSection01;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random01 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.zomato.com/india");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.swiggy.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.makemytrip.com/");
		
		Set<String> win=driver.getWindowHandles();
		
		for(String i: win) {
		String title=driver.switchTo().window(i).getTitle();
		System.out.println(title);
		
		if(!title.contains("Best Restaurants")) {
			
			driver.close();
			
		}
		
		}
		//driver.close();
	}

}
