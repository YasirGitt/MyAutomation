package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.diver","C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Selenium work space\\\\Selenium Project\\\\Server\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/health-personal-care-appliances/personal-care-appliances/shavers/pr?sid=zlw%2C79s%2Cu3j&fm=neo%2Fmerchandising&iid=M_abc94b2e-c5ad-4d9f-a408-f077e0b71fda_1_372UD5BXDFYS_MC.7IRTITZ74DB6&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L2_view-all&cid=7IRTITZ74DB6&hpid=zGQlhArn0YmltUO10UPgIKp7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJGcm9tIOKCuTEsNjQ5Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiU0hWR0g4OTZHMlZCRUREWCIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkJlc3Qgb2YgU2hhdmVycyJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX19fX0%3D&fm=neo%2Fmerchandising&iid=M_899b9ade-e4f9-47ac-9dcd-dd6673bc7c92_3.8JR5BM71BUKP&ppt=sp&ppn=sp&ssid=b2hg80gt1c0000001675187939978&otracker=hp_omu_Best%2Bof%2BElectronics_1_3.dealCard.OMU_8JR5BM71BUKP_3&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Best%2Bof%2BElectronics_NA_dealCard_cc_1_NA_view-all_3&cid=8JR5BM71BUKP");
//	    driver.findElement(By.xpath("//a[text()='NOYMI 3D Rechargeable 100% Waterproof IPX7 Electric Sha...']/following-sibling::a/div/div")).click();
		String data= driver.findElement(By.xpath("//a[text()='NOYMI 3D Rechargeable 100% Waterproof IPX7 Electric Sha...']/following-sibling::a/div/div")).getText(); // it is use to fetch the data from the application
		System.out.println(data);
		
	    String s=driver.findElement(By.xpath("//div[text()='₹1,329']/../../preceding-sibling::a[1]")).getText();
	    System.out.println(s);
	    
	    String s1=driver.findElement(By.xpath("//div[text()='₹1,999']/../../preceding-sibling::a[1]")).getText();
	    System.out.println(s1);
	    
	    String s2=driver.findElement(By.xpath("//a[text()='PHILIPS S1121/45  Shaver For Men']/following-sibling::a/div/div")).getText();
	    System.out.println(s2);
	    
	    Thread.sleep(3000);
	    String s3=driver.findElement(By.xpath("//a[text()='PHILIPS BG3006/15 Bodygroomer  Shaver For Men']/following-sibling::a/div/div")).getText();
	    System.out.println(s3);
	    
	    String s4=driver.findElement(By.xpath("//div[text()='₹2,477']/../../preceding-sibling::a[1]")).getText();
	    System.out.println(s4);
	}
}
