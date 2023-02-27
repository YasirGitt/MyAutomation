package SectionB;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Justfunn {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter browser name");
		
		String browser=sc.next();
		
		if(browser.equals("chrome")) {
			
			System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			TakesScreenshot sh= (TakesScreenshot)driver;
			
			File src= sh.getScreenshotAs(OutputType.FILE);
			
			File dist= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot\\p5.png");
			
			Files.copy(src, dist);
			
			driver.findElement(By.name("")).sendKeys("any");
			
		}
		else if(browser.equals("edge")) {
			System.setProperty("Webdriver.edge.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.google.co.in/");
		}
		else {
			System.out.println("wrong input");
		}
	
	}

}
