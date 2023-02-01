package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Selenium work space\\\\\\\\Selenium Project\\\\\\\\Server\\\\\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=61666692631&hvpone=&hvptwo=&hvadid=486447282128&hvpos=&hvnetw=g&hvrand=1383660619322800738&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-304880464215&hydadcr=14450_2154367&gclid=Cj0KCQiAz9ieBhCIARIsACB0oGJA0hckpwSfdo7Oo7pHNuwjZ0BwTj0-ltidTBi5hJlVUFIhYBbAuRcaAknXEALw_wcB");
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 13 pro");
		
		//driver.findElement(By.xpath("//input[id='nav-search-submit-button']")).click();
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro (1TB) - Silver']")).click();
		
		//driver.findElement(By.xpath("//span[text()=\"Apple iPhone 14 Pro 128GB Space Black\"]")).click();
		
		
	}

}
