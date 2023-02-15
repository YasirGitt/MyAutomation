package Extra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipAllNP {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement ele1=driver.findElement(By.name("q"));
			ele1.sendKeys("macbook air m2");
			ele1.submit();
			Thread.sleep(3000);
			List<WebElement> ele=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			List<WebElement> ele2=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			
			for(int i=1; i<ele.size(); i++) {
				
				String name=ele.get(i).getText();
				String price=ele2.get(i).getText();
				
				System.out.println(i+"     "+name+"      "+price);
		
			}
	}

}
