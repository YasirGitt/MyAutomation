package Section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowseLaunch {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.edge.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\msedgedriver.exe");
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/search?q=hero&oq=hero&aqs=chrome..69i57.1907j0j15&sourceid=chrome&ie=UTF-8");
		
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		
		Dimension d= new Dimension(200,200);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.close();
		
	
		
	}

}
