package SectionB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphonePrice {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele1=driver.findElement(By.name("q"));
		ele1.sendKeys("iphone 14");
		ele1.submit();
		
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> ele2=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0; i<ele.size(); i++ ) {
			
			System.out.println(i+"        "+ele.get(i).getText()+"         "+ele2.get(i).getText());
	
			
				
			
			
//		for(WebElement i : ele) {
//			
//			String data= i.getText();
//			
//			System.out.println(data);
//		}
//		for(WebElement i : ele2) {
//			
//			String data= i.getText();
//			
//			System.out.println(data);
			
			
		}

		}
		
	}
