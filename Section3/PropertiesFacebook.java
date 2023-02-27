package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=15461201666&extra_1=s%7Cc%7C589521732875%7Cb%7Cfacebook%20%27%7C&placement=&creative=589521732875&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D15461201666%26adgroupid%3D130924380175%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAxvGfBhB-EiwAMPakqqHGphsxycID7AdNGoyi2uFDIu8G9-6dnnfwLxz42P7Xgm5Gr6o0bBoCSqYQAvD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("james");
		driver.findElement(By.name("lastname")).sendKeys("Gosling");
		driver.findElement(By.name("reg_email__")).sendKeys("maclawren63@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("maclawren63@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Yasir@4567");
		driver.findElement(By.id("day")).sendKeys("20");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

		

		
	}
	

}
