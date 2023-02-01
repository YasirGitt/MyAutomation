package Section1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyYoutubeLunch {
	public static void main(String []args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// open the web application
		driver.get("https://www.youtube.com/@mytripcart");
	
		
		// fetch the title of the web application.
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// fetch the current url.
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		//maximize the browse
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=qpaOl0LOofo");
		
		//minimize the window.
		Thread.sleep(10000);
		driver.manage().window().minimize();
		
	    Dimension d= new Dimension(300,400);
		Thread.sleep(3000);
		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		
		
	}

}
