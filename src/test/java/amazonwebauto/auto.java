package amazonwebauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&prevRID=14MQCVK1N010ECYP6JVV&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("admin");
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9542721530");
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@gmail.com");
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@1234");
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.close();
		 
		 
		 
			
		 
		 
		 
		 
		 
		 
	}

}

