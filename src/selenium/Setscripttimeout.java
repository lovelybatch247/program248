package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setscripttimeout {

	public static void main(String[] args) {
		// Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MILLISECONDS);
		//Launch site
		driver.get("https://www.facebook.com/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Enter data in email field
		WebElement e=driver.findElement(By.name("email"));
		try 
		{
			driver.executeScript("arguments[0].value='kalam'", e);
		}
		catch(Exception ste)
		{
			System.out.println("Javascript code is taking more than 1 milliseconds");
		}
		
		
		

	}

}
