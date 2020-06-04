package selenium;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriverlogs {

	public static void main(String[] args) {
		//Open firefox browser and avoid browser driver logs
		System.setProperty("webdriver.gecko.driver","C:\\LOVELY\\selenium20\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\LOVELY\\selenium20\\logs.txt");
		//System.setProperty(""); 
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");

	}

}
