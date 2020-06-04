package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadtimeout {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		//Launch site
		try 
		{
			driver.get("https://www.facebook.com/");
		}
		catch(Exception te)
		{
			System.out.println("facebook homepage loading is taking more than 1 second");
		}
		
		

	}

}
