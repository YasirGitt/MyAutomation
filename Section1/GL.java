package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GooglePage;

public class GL {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://google.com/");
		
		GooglePage.TextBox_search(driver).sendKeys("abcd");
		GooglePage.Button_search(driver).click();
	
	}

}
