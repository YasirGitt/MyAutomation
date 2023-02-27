package SectionB;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class DateAdded {
	public static void main(String[] args) {
System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium work space\\Selenium Project\\Server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		Calendar ca= Calendar.getInstance();
		
		ca.add(Calendar.DAY_OF_MONTH,5);
		
		Date da= ca.getTime();
		
		System.out.println(da);
		
		SimpleDateFormat sdf= new SimpleDateFormat("DD/MM/YYYY");
		
		String Formatedate= sdf.format(da);
		
		System.out.println(Formatedate);
		
		driver.findElement(By.id("datepicker")).sendKeys(Formatedate,Keys.ESCAPE);
		
		
	}

}
