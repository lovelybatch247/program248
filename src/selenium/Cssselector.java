package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.who.int/health-topics/coronavirus#tab=tab_1");
		//Maximize window
		driver.manage().window().maximize();
		//Click on Find out more
		driver.findElement(By.cssSelector("div.button.button-white")).click();
		
	}

}
