package Section2;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeNew {
	public static void main(String[] args) throws InterruptedException {
		
		Random r= new Random();
		
		int data=r.nextInt();
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://demo.actitime.com/login.do");
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		
		
		System.out.println(title);
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Yasir"+data);
		
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("Just for fun");
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
		
		
		
	}

}
