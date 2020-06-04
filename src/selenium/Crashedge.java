package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.google.common.collect.ImmutableMap;

public class Crashedge {

	public static void main(String[] args) throws Exception{
		//Open browser
		System.setProperty("webdriver.edge.driver", "C:\\LOVELY\\selenium20\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver1=new EdgeDriver();
		//Launch site
		driver1.get("https://www.who.int/health-topics/coronavirus#tab=tab_1");
		//Maximize window
		driver1.manage().window().maximize();
		//Click on Find out more
	    driver1.findElement(By.cssSelector("div.button.button-white")).click();
	    Thread.sleep(2000); 
	    //Create DevTools session
	    DevTools dt=driver1.getDevTools();
	    dt.createSession();
	    //Crash the browser window
	    try 
	    {
	        Command c=new Command("Browser.crash",ImmutableMap.of());
	 	    dt.send(c);
	    }
	   catch(Exception e)
	    {
		   System.out.println("Continue further testing");
	    }
	    //Open new browser and re-launch site
	    EdgeDriver driver2=new EdgeDriver();
	    driver2.get("https://www.who.int/health-topics/coronavirus#tab=tab_1");
	}

}
