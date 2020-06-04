package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;

import com.google.common.collect.ImmutableMap;

public class Recoverytesting_browsercrash {

	public static void main(String[] args) throws Exception {
		//Open browser
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		//Create DevTools session
		DevTools dt=driver1.getDevTools();
		dt.createSession();
		//Launch site
		driver1.get("https://www.who.int/health-topics/coronavirus#tab=tab_1");
		//Maximize window
		driver1.manage().window().maximize();
		//Click on Find out more
	    driver1.findElement(By.cssSelector("div.button.button-white")).click();
	    Thread.sleep(2000);
	    //Crash the browser window
	    try 
	    {
	    	Command c=new Command("Browser.crash",ImmutableMap.of());
	    	dt.send(c);
	    	
	    	
	    }
	    catch(Exception ex)
	    {
	    	System.out.println("Continue further testing");
	    }
	    //Open new browser
	    ChromeDriver driver2=new ChromeDriver();
	    driver2.get("https://www.who.int/health-topics/coronavirus#tab=tab_1");
				
	}

}
