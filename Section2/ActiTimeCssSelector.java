package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCssSelector {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[id='container_reports']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[id='container_users']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[class='components_button_label']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='createUserPanel_firstNameField']")).sendKeys("Yasir");
		Thread.sleep(1000);
		
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("Raza");
		Thread.sleep(1000);
		
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys("dicasta@mail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[class='components_switcher small on animated']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("ext-gen610")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector("button[id='ext-gen665']")).click();
		
//		driver.findElement(By.cssSelector("div[class='closeButton hideButton_panelContainer']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("logoutLink")).click();
//		Thread.sleep(1000);
		
	}

}
