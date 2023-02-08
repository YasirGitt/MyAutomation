package SectionB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTextPrint {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//span"));
		
		for(WebElement i : ele) {
			
			String data= i.getText();
			System.out.println(data);
		}
		
	
		}
		
	}
