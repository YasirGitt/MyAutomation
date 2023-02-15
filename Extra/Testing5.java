package Extra;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing5 {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.driver","");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("flipkart");
		ele.submit();
		
		WebElement ele2=driver.findElement(By.xpath("//h3[text()='Flipkart']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(ele2);
		
		ele2.click();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement ele3=driver.findElement(By.name("q"));
		ele3.sendKeys("apple earbuds");
		ele3.submit();
		
		String name=driver.findElement(By.xpath("//a[text()='Apple AirPods(2nd gen) with Charging Case Bluetooth Hea...']")).getText();
		System.out.println(name);
		
		WebElement ele4=driver.findElement(By.xpath("//a[text()='Apple AirPods(2nd gen) with Charging Case Bluetooth Hea...']/following-sibling::div[3]/following-sibling::a/div/div"));
	    String price=ele4.getText();
	    System.out.println(price);
	    
//	   driver.findElement(By.name("q")).clear(); 
//	   driver.findElement(By.name("q")).sendKeys("apple earbuds"); 
//	   List<WebElement> l=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
//	   
//	    for(int i=1; i<l.size(); i++) {
//	    	
//	    	String s=l.get(i).getText();
//	    	
//	    	System.out.println(s);
	    
	    
	    List<WebElement> ele5= driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
	    List<WebElement> ele6=driver.findElements(By.xpath("//div[@class='_30jeq3']"));
	    
	    for(int i=1; i<ele5.size(); i++) {
	    	
	    	String ename=ele5.get(i).getText();
	    	String eprice=ele6.get(i).getText();
	    	
	    	if(ename.contains("APPLE"))
	    	
	    	System.out.println(i+"     "+ename+"        "+eprice);
	    	
	    }
	
}
	}

