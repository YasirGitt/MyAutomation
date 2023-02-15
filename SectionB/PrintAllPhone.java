package SectionB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllPhone {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement ele1=driver.findElement(By.xpath("//input[@type='text']"));
        ele1.sendKeys("iphone 14 pro");
        ele1.submit();
		
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]"));
		
		for(WebElement i: ele) {
			
			String data= i.getText();
			
			System.out.println(data);
		}
	}

}
