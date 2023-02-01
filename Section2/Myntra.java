package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
	System.setProperty("Webdriver.Chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Selenium work space\\\\\\\\Selenium Project\\\\\\\\Server\\\\\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("nike");
		
		driver.findElement(By.xpath("//a[@data-reactid='908']")).click();
		
		driver.findElement(By.xpath("//h4[text()='Men Flex Experience Running']")).click();

		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size']")).click();
	}

}
