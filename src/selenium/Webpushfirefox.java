package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Webpushfirefox {

	public static void main(String[] args) {
		//Set a value to a preference to stop notifications
		FirefoxOptions fo=new FirefoxOptions();
		fo.addPreference("dom.webnotifications.enabled","false"); 
		//open firefox browser
	
		System.setProperty("webdriver.gecko.driver","C:\\LOVELY\\selenium20\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(fo);
		driver.manage().window().maximize();
		//Launch site & wait until text box is visible in page
		driver.get("https://www.redbus.in");
		
	}

}
