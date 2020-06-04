package selenium;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;

import com.google.common.collect.ImmutableList;


public class Urlfilter {

	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Connect to DevTools and create a session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Enable network and set blocked URL patterns
		Command cmd1=Network.enable(Optional.empty(),Optional.empty(), Optional.empty());
		Command cmd2=Network.setBlockedURLs(ImmutableList.of("*.css","*.jpg","*.png"));
		dt.send(cmd1);
		dt.send(cmd2);
		//Launch site
		driver.get("https://www.amazon.com");
		dt.send(Network.disable());

	}

}
