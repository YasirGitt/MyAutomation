package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CronaVirus {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.worldometers.info/coronavirus/");
			driver.manage().window().maximize();
			
			String data1=driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']")).getText();
			System.out.println(data1);
			String data=driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/following-sibling::div/span")).getText();
	        System.out.println(data);
	     
		}

}
