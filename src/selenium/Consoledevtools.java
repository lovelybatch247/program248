package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.console.Console;

public class Consoledevtools {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.google.co.in");
		//Create object to access DevTools & start session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Go to console and run javascript commands through that console on browser
		Command cmd=Console.enable();
		dt.send(cmd);
		driver.executeScript("console.log('hi');");
		driver.executeScript("console.log(window.scrollTo(0,document.body.scrollHeight));");
		driver.executeScript("console.log(document.getElementsByName('q')[0].style.border='5px blue dotted');");
		//dt.send(Console.disable());
	}

}
