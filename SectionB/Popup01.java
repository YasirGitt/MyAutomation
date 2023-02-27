package SectionB;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup01 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
        
        driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
        
        driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']/div/div")).click();
    
        driver.findElement(By.linkText("Types of Work")).click();
        
        driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
        
        driver.findElement(By.id("name")).sendKeys("anything");
        
        driver.findElement(By.cssSelector("input[type='button']")).click();
        
        Alert alt= driver.switchTo().alert();
        
        System.out.println(alt.getText());
        
        Thread.sleep(2000);
        alt.dismiss();
        
        driver.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(2000);
        alt.accept();
        
     
        
        
        
        
    
        
       
	}

}
