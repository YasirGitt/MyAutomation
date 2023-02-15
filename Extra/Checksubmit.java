package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checksubmit {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		
		ele.sendKeys("apple mac book pro");
		ele.submit();
		
		driver.findElement(By.xpath("//span[text()='Apple 2021 MacBook Pro (16-inch//41.05 cm, M1 Max chip with 10‑core CPU and 32‑core GPU, 32GB RAM, 1TB SSD) - Space Grey']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]")).click();
		String name=driver.findElement(By.xpath("//span[text()='Apple 2021 MacBook Pro (16-inch//41.05 cm, M1 Max chip with 10‑core CPU and 32‑core GPU, 32GB RAM, 1TB SSD) - Space Grey']")).getText();
		System.out.println(name);
        String price=driver.findElement(By.xpath("//span[text()='Apple 2021 MacBook Pro (16-inch//41.05 cm, M1 Max chip with 10‑core CPU and 32‑core GPU, 32GB RAM, 1TB SSD) - Space Grey']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]")).getText();

        System.out.println(price);
}
}
