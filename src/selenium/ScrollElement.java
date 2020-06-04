package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement 
{

	public static void main(String[] args) throws Exception 
	{
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		Thread.sleep(5000);
		//Scroll down the page to get visibility of specific element 
		Actions a=new Actions(driver);
		for(int i=1;i<=10;i++) 
		{
			a.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		//Scroll down specific element
		WebElement e=driver.findElement(By.xpath("(//pre[contains(@class,'prettyprint')])[1]"));
		for(int i=1;i<=10;i++) 
		{
			a.sendKeys(e,Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		//Scroll up specific element
		for(int i=1;i<=10;i++) 
		{
			a.sendKeys(e,Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		//Scroll right specific element
		for(int i=1;i<=10;i++) 
		{
			a.sendKeys(e,Keys.ARROW_RIGHT).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		//Scroll left specific element
		for(int i=1;i<=10;i++) 
		{
			a.sendKeys(e,Keys.ARROW_LEFT).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		//Close site
		driver.close();
	}

}
