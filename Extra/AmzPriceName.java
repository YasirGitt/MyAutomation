package Extra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzPriceName {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("iphone 14");
		ele.submit();
		Thread.sleep(3000);
		List<WebElement> ele2=driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 14')]"));
		
		List<WebElement> ele3=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(int i=1; i<ele2.size(); i++) {
			
			String name=ele2.get(i).getText();
			String price=ele3.get(i).getText();
			
		System.out.println(i+"   " +name+"      "+price);
		}
	}

}
