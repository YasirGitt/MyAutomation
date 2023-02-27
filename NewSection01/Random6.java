package NewSection01;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("James Gosling");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("doreman");
	    driver.findElement(By.xpath("//div[text()='- Select Customer -']")).click();
		List<WebElement> data=driver.findElements(By.xpath("//div[@class='searchItemList']/div"));
	
	for(WebElement i: data) {
		
		String name=i.getText();
		if(name.contains("Big")) {
			
			i.click();
		}
	}
	driver.findElement(By.id("customerLightBoxCloseButton")).click();
	Thread.sleep(3000);
	Alert alt=driver.switchTo().alert();
	
	Thread.sleep(3000);
	alt.accept();
	
		


		
		
		
	}

}
