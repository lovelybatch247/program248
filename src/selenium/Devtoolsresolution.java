package selenium;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Devtoolsresolution {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Create fake user agent with different resolutions and device models
		HashMap<String, Object> fua=new HashMap<>();
		//fua.put("userAgent", "Mozilla/5.0(iPhone:CPU iPhone OS 11_0 like Mac OS X)AppleWebKit/604.1.38(KHTML,like Gecko)Version/11.0 Mobile/15A372 Safari/604.1");
		fua.put("userAgent", "Mozilla/5.0(Linux;Android 7.0;SM-G930V Build/NRD90M)AppleWebKit/537.36(KHTML,like Gecko)Chrome/59.0.3071.125 Mobile Safari/537.36");
		driver.executeCdpCommand("Emulation.setUserAgentOverride", fua);
		HashMap<String, Object> nr=new HashMap<>();
		nr.put("width", 375);
		nr.put("height", 812);
		nr.put("deviceScaleFactor", 3);
		nr.put("mobile", true);
		nr.put("scale", 1);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", nr);
		driver.get("https://www.amazon.com");

	}

}
