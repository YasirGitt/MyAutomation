package Section2;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Webd {
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
//		
//		WebDriver driver= new ChromeDriver();
//		
//		WebDriver driver2= new WebDriver(); // it is not valid because interface does not have constructor since we cannot create object of interface
		
		SearchContext driver1= new ChromeDriver(); // with this driver we can perform only open web browser
		                                           // we cannot perform other operations.
		
		//driver1.get("https://demo.actitime.com/login.do");
		
		
	}

}
