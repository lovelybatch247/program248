package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoactiveelement {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.way2sms.com/");
		//Switch to active element
		driver.switchTo().activeElement().sendKeys("9068785388");
	}

}
