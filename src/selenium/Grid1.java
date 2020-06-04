package selenium;


import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid1 {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities dc1=new DesiredCapabilities();
		dc1.setBrowserName("chrome");
		ChromeOptions opt = new ChromeOptions();
		URL u1=new URL("http://192.168.0.106:4444/wd/hub");
	    RemoteWebDriver driver1=new RemoteWebDriver(u1,opt);
	    driver1.get("http://www.gmail.com");
	    Thread.sleep(5000);
	    driver1.close();
	}

}
