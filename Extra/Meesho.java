package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		Thread.sleep(1000);
		WebElement a=driver.findElement(By.cssSelector("input[placeholder='Try Saree, Kurti or Search by Product Code']"));
		a.sendKeys("shoes");
		a.sendKeys(Keys.RETURN);
//		Thread.sleep(5000);
//		WebElement s =driver.findElement(By.cssSelector("svg[class='sc-bcXHqe gCaeH']"));
//		s.sendKeys(keys);
		
		//driver.findElement(By.cssSelector("input[class='sc-gswNZR HQNKF sc-dUipGc hPixLM search-input-elm sc-dUipGc hPixLM search-input-elm']")).sendKeys("shoes");
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("shoes");
//		driver.findElement(By.cssSelector("svg[class='sc-gswNZR jweCCb']")).click();
		
		Thread.sleep(3000);
		String name=driver.findElement(By.xpath("//p[text()='Unique Attractive Men Sports Shoes']")).getText();
		System.out.println(name);
		Thread.sleep(3000);
		String price=driver.findElement(By.xpath("//p[text()='Unique Attractive Men Sports Shoes']/following-sibling::div/h5")).getText();
		System.out.println(price);
		
		String n=driver.findElement(By.xpath("//p[text()='Relaxed Fashionable Men Sports Shoes']")).getText();
		System.out.println(n);
		String pr=driver.findElement(By.xpath("//p[text()='Relaxed Fashionable Men Sports Shoes']/following-sibling::div/h5")).getText();
		System.out.println(pr);

}
}
