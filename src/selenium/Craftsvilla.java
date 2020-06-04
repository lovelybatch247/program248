package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Craftsvilla {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");
		/*driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		driver.findElement(By.id("emailId")).sendKeys("9078785309");
		driver.findElement(By.xpath("//div[starts-with(text(),'C')]")).click();*/
		driver.findElement(By.xpath("//a[text()='LEHENGAS & GOWNS ']")).click();
		driver.findElement(By.xpath("//label[@title='2000-5000']")).click();
		
		try {
		    WebElement e1 = driver.findElement(By.xpath("//span[contains(text(),'Color')]/ancestor::span/following-sibling::span"));
		    e1.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			 WebElement e1 = driver.findElement(By.xpath("//span[contains(text(),'Color')]/ancestor::span/following-sibling::span"));
			 e1.click();
		}
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//label[@title='Green']")).click();
		
		try {
		    WebElement e2 = driver.findElement(By.xpath("//div[@data-id='6237136']"));
		    e2.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			 WebElement e2 = driver.findElement(By.xpath("//div[@data-id='6237136']"));
			 e2.click();
		}
		//Thread.sleep(2000);
		
		Thread.sleep(2000);
		
			driver.findElement(By.id("addtocart")).click();
		
		Thread.sleep(2000);
			driver.findElement(By.id("place-order-btn")).click();
		
		
	
		
		
	}

}
