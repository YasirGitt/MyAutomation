package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipFirstPrice {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement ele=driver.findElement(By.xpath("//div[text()='Electronics']"));
			
			Actions act= new Actions(driver);
			
			act.moveToElement(ele).perform();
			driver.findElement(By.xpath("//a[text()='Gaming']")).click();
		
//			WebElement ele1=driver.findElement(By.xpath("//a[text()='ASUS TUF Gaming M4 Air Wired Optical  Gaming Mouse']"));
//			String name=ele1.getText();
//			System.out.println(name);
//			
//			WebElement ele2=driver.findElement(By.xpath("//a[text()='ASUS TUF Gaming M4 Air Wired Optical  Gaming Mouse']/following-sibling::div[2]/following-sibling::a/div/div"));
//		    
//			String price=ele2.getText();
//			
//			System.out.println(price);
			
		WebElement d=driver.findElement(By.partialLinkText("ASUS TUF Gaming M4"));
			
			String nama=d.getText();
			
			System.out.println(nama);
	}


}
