package selenium;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.devtools.network.model.ConnectionType;

public class Diffnetworkcon {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Define expected network conditions
		Command cmd1=Network.enable(Optional.of(1000000),Optional.empty(),Optional.empty());
		Command cmd2=Network.emulateNetworkConditions(false, 100, 200000, 100000, Optional.of(ConnectionType.CELLULAR4G));
		dt.send(cmd1);
		dt.send(cmd2);
		long st=System.currentTimeMillis();
		driver.get("https://www.google.co.in");
		long et=System.currentTimeMillis();
		System.out.println("Loading time is "+(et-st));
		//dt.send(Network.disable());
		
		

	}

}
