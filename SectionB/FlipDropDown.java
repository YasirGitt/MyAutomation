package SectionB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			int c=0;
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement el=driver.findElement(By.name("q"));
			el.sendKeys("iphone 14");
			
		List<WebElement> ele= driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		for(WebElement i: ele) {
		
			String name=i.getText();
			c++;
			System.out.println(c+"       "+name);
		}
	}

}
