package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.thoughtworks.selenium;
//import com.thoughtworks.selenium.Selenium;

public class Tooltip 
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
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		Thread.sleep(5000);
		
		//Selenium s=new DefaultSelenium();
		//System.out.println(s.isAlertPresent());
		
		//Tool tip is title attribute value for target element
		WebElement e1=driver.findElement(By.linkText("PHP"));
		String tt1=e1.getAttribute("title");
		System.out.println(tt1);
		//Tool tip is child element to target element
		WebElement e2=driver.findElement(By.xpath("//div[starts-with(text(),'To')]"));
		Actions a=new Actions(driver);
		a.moveToElement(e2).clickAndHold().build().perform();
		Thread.sleep(5000);
		WebElement e3=e2.findElement(By.xpath("child::span"));
		String tt2=e3.getText();
		System.out.println(tt2);
		a.release().perform();
		Thread.sleep(2000);
		//Close site
		driver.close();
			
	}

}
