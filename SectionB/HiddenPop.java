package SectionB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPop {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='img']")).click();
		
		driver.findElement(By.cssSelector("div[class='delete button']")).click();
		
		Thread.sleep(3000);
        String data=driver.findElement(By.xpath("//span[text()='Warning: Task deletion cannot be undone.']")).getText();
   
        String data1=driver.findElement(By.xpath("//span[text()='Please confirm following actions related to the task deletion:']")).getText();
   
   
   
        System.out.println(data);
        System.out.println(data1);
	}

}
