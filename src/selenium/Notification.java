package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		 String[] s=new String[]{"enable-automation"};
		 ChromeOptions co=new ChromeOptions();
		 co.setExperimentalOption("excludeSwitches",s);
		 ChromeDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();

	}

}
