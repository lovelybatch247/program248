package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webpushchrome {

	public static void main(String[] args) {
		//Add chrome native commands to stop web push notifications in chrome browser
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		//Open chrome browser and launch site
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");

	}

}
