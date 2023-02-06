package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/search?q=shoe&searchType=manual&searchIdentifier=text_search");
		
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
