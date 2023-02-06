package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzApple {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=apple+iphoen&crid=1ARONGL8UVL2W&sprefix=apple+iphon%2Caps%2C256&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		String s1=driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - White']")).getText();
		System.out.println(s1);
		
		String data= driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - White']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]")).getText();
		System.out.println(data);
		
		String s2=driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']")).getText();
		System.out.println(s2);
		
		String data2= driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]")).getText();
		System.out.println(data2);
	}
}
