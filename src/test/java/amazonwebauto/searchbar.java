package amazonwebauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Realme 7");
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("(Renewed) Realme 7 Pro (Mirror Silver, 6GB RAM, 128GB Storage)")).click();
		 Thread.sleep(1500);
		 
		 driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		 Thread.sleep(1500);
		 driver.close();
		 
		 

	}

}
