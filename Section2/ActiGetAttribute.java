package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiGetAttribute {
	public static void main(String[] args) {
	System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
//	WebElement ele1=driver.findElement(By.id("keepLoggedInCheckBox"));
//	String att= ele1.getAttribute("title");
//	System.out.println(att);
	
	String m=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	System.out.println(m);
	
//	String mm=driver.findElement(By.xpath("//label[text()='Keep me logged in']")).getText();
//	System.out.println(mm);
		
	}

}
