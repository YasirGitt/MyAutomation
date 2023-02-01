package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingON {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		Navigation nav= driver.navigate();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		String url= driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		nav.forward();
		Thread.sleep(1000);
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='added-manually']")).click();
		
		
		nav.back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
		
		nav.back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Context Menu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='hot-spot']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

	
}
