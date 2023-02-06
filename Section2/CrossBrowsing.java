package Section2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Browser Name");
		String Browser=sc.next();
		
		if(Browser.equals(Browser)) {
			
			System.setProperty("Webderiver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(Browser.equals(Browser)) {
			System.setProperty("Webdriver.Edge.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
		else {
			System.out.println("Wrong input");
		}
		driver.get("https://www.amazon.in/s?k=apple+watch&sprefix=ap%2Caps%2C337&ref=nb_sb_ss_ts-doa-p_1_2");
		Thread.sleep(3000);
//		String s=driver.findElement(By.xpath("//span[text()='Apple Watch SE (GPS + Cellular, 44mm) - Space Grey Aluminium Case with Midnight Sport Band - Regular']/../../../following-sibling::div[2]/div/div/div/div[2]/a/span/span/span[2]")).getText();
//		System.out.println(s);
		
		String s1=driver.findElement(By.xpath("//span[contains(text(),'Apple Watch Series 8')]")).getText();
		System.out.println(s1);
	}

}
