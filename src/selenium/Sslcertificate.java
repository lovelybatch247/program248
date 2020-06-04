package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.security.Security;

public class Sslcertificate {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Activate security panel
		Command cmd1=Security.enable();
		dt.send(cmd1);
		//Set to ignore SSL certificate errors
		Command cmd2=Security.setIgnoreCertificateErrors(true);
		dt.send(cmd2);
		//Launch insecure website
		driver.get("https://expired.badssl.com/");
		dt.send(Security.disable());
	}

}
