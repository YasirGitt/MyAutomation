package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=apple%2014&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String name=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).getText();
		System.out.println(name);
		String price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']/../following-sibling::div/div/div/div")).getText();
		System.out.println(price);
	}

}
