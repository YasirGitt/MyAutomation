package NewSection01;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Random9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter browser name");
		
		String browser=sc.next();
		
		if(browser.equals("chrome")) {
			
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//button[text()='No thanks']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//g-flat-button[@class='U8shWc r2fjmd hObAcc gTewb VDgVie Vy8nid']")).click();
		}
		else if(browser.equals("edge")){
			driver=new EdgeDriver();
			driver.get("https://www.google.com/");
		}
			
		}
	}

