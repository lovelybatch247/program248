package selenium;

import java.util.HashMap;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;

public class Changetimezone 
{

	public static void main(String[] args) 
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Connect to DevTools and create a session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		Command cmd=Network.enable(Optional.empty(), Optional.empty(), Optional.empty());
		dt.send(cmd);
		HashMap<String,Object> x=new HashMap<>();
		x.put("timezoneId", "Europe/London");
		driver.executeCdpCommand("Emulation.setTimezoneOverride", x);
	    driver.get("https://momentjs.com/");
	  //  dt.send(Network.disable());
	    

	}

}
