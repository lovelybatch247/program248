package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		// Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//launch site
		driver.get("https://mail.google.com/mail/u/0/#inbox");
	}

}
