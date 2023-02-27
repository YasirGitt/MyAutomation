package NewSection01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateTime01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium2\\sever\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.timeanddate.com/");
		
	WebElement ele=driver.findElement(By.xpath("//a[text()='Calculators']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		
	List<WebElement>ele1=driver.findElements(By.xpath("//a[text()='Date to Date Calculator (duration)']/../following-sibling::li"));
	for(WebElement i: ele1) {
		String name= i.getText();
		System.out.println(name);
	}

	WebElement ele2=driver.findElement(By.xpath("//a[text()='Calendar']"));
	act.moveToElement(ele2).perform();
	List<WebElement> ele3=driver.findElements(By.xpath("//a[text()='Calendar 2023']/../following-sibling::li"));
	
	for(int i=0; i<ele3.size(); i++) {
		
		String sname=ele3.get(i).getText();
		System.out.println(sname);
		
	}
	}
	

}
