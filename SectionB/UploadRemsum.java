package SectionB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadRemsum {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.foundit.in/");
		
		driver.findElement(By.cssSelector("div[class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot\\resume.pdf");
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

//		
//		driver.findElement(By.cssSelector("input[placeholder='Enter your full name']")).sendKeys("Yasir raza");
//		
//		driver.findElement(By.name("email")).sendKeys("Yasir@gmail.com");
//		
//		driver.findElement(By.cssSelector("input[class='input pass']")).sendKeys("12345678");
//		
//		driver.findElement(By.cssSelector("input[placeholder='Enter your Mobile Number for recruiters to reach you']")).sendKeys("7867564534",Keys.TAB,"Hyderaabad",Keys.TAB,Keys.DOWN,Keys.ENTER);
//		
//		
//		
//List<WebElement> ele1=driver.findElements(By.xpath("//ul[@class='multiselect__content ddn-scrollable modal-ref-class single-selected']/li"));
//
//for(WebElement i: ele1) {
//	
//	String data=i.getText();
//	
//	if(data.contains("fresher")) {
//		
//		i.click();

	
	
		

		//driver.findElement(By}.id("pop_upload")).click();
		
//		StringSelection s=  new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot");
//		
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//		
//		Thread.sleep(3000);
//		
//		Robot r= new Robot();
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
	}


