package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Consolemsg
{

	public static void main(String[] args) 
	{
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Create object to "Listener" class which consists of bodies to methods
		Listener obj=new Listener();
		//Register "Listener" object to "EventFiringWebDriver"
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		edriver.register(obj);
		//Launch site via navigate
		edriver.navigate().to("http://www.amazon.com");
		//Dismiss alert
		//Alert alert=edriver.switchTo().alert();
		//alert.dismiss();
		//Find an element
		WebElement e=edriver.findElement(By.linkText("Click to learn more"));
		e.click();
		//Navigate to previous page
		edriver.navigate().back();
		//Refresh page
		edriver.navigate().refresh();
		//Navigate to next page
		edriver.navigate().forward();
		//Get text of an element
		System.out.println(edriver.findElement(By.cssSelector("div#nav-xshop >a:nth-of-type(3)")).getText());
		
		
		
	}

}
