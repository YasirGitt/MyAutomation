package SectionB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salman {
	public static void main(String[] args) throws InterruptedException {
       System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("salman");
		
	Thread.sleep(2000);	
	List<WebElement> ele=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	
	for(WebElement i: ele) {
		String data= i.getText();
		if(data.contains("wife"))
		System.out.println(data);
	}
		
	}

}
