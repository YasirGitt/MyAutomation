package NewSection01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Random7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("amazon.in",Keys.ENTER);
		
		WebElement ele= driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(ele).click().build().perform();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple macbook pro",Keys.ENTER);
		
		//it is use to print the price of the product by using parent child relationship
		
	String name=driver.findElement(By.xpath("//span[text()='Apple 2021 MacBook Pro (16-inch/41.05 cm, M1 Max chip with 10‑core CPU and 32‑core GPU, 32GB RAM, 1TB SSD) - Silver']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]")).getText();
	
	System.out.println(name);
	
	// it is use to print all machine data from web application to console.
	
List<WebElement> ele1=driver.findElements(By.xpath("//span[contains(text(),'Apple 2021 MacBook Pro ')]"));
for(WebElement i: ele1) {
	
	String name1=i.getText();
	System.out.println(name1);
}
	}

}
