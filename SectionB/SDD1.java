package SectionB;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SDD1 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
	
		Random r= new Random();
		int num=r.nextInt();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		
		WebElement ele2=driver.findElement(By.id("container_tasks"));
		
	    Actions act= new Actions(driver);
	    
	    act.moveToElement(ele2).doubleClick().build().perform();
	    
	   driver.findElement(By.xpath("//div[text()='Add New']")).click();
	   
	 driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	 
	 driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(num+"Yasir");
	 
	 driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("nothing just having a funn");
	
	 driver.findElement(By.xpath("//div[text()='- Select Customer -']")).click();
	 
	 //driver.findElement(By.xpath("//div[@class='itemRow cpItemRow ' and text()='Big Bang Company']")).click();
	
	 
	 List<WebElement> ele4=driver.findElements(By.xpath("//div[@class='searchItemList']/div"));
	 
	 for(WebElement i: ele4) {
		 
		 String all= i.getText();
		 
		 System.out.println(all);
		 
//		 if(all.contains("Galaxy")) {
//			 
//			 i.click();
//			
			 
		 }
		 
	 }
	}




