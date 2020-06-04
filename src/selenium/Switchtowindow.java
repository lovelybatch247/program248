package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtowindow {

	public static void main(String[] args) throws Exception {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//click on Gmail link
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		//click on Sign in link
		driver.findElement(By.partialLinkText("Sign in")).click();
		String h=driver.getWindowHandle();
		//Collect all browser window/tab handles
		Set<String> handles=driver.getWindowHandles();
		//Switch to gmail browser window
		for(String handle:handles)
		{
			
			driver.switchTo().window(handle);
			if(driver.getTitle().equals("Gmail"))
			{
				Thread.sleep(5000);
				driver.findElement(By.name("identifier")).sendKeys("selenium3");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				break;
			}
			
		}
	
		//Switch to previous window
		driver.switchTo().window(h);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.craftsvilla.com/");
		
		/*Thread.sleep(5000);
		//Collect all browser window/tab handles
		Set<String> handles=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(handles);
		//switch to 2nd browser window/tab
		driver.switchTo().window(l.get(1));
		driver.findElement(By.name("identifier")).sendKeys("selenium3");
		Thread.sleep(5000);
		//switch to 1st browser window/tab
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		//click on Sign in link
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(5000);
		//Collect all browser window/tab handles
		handles=driver.getWindowHandles();
		l=new ArrayList<String>(handles);
		//switch to 3rd browser window/tab
		driver.switchTo().window(l.get(2));
		driver.findElement(By.name("identifier")).sendKeys("selenium4");
*/
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.craftsvilla.com/");
		
		//driver.switchTo().window("Gmail");
		
		/*Set<String> handles = driver.getWindowHandles();
		for (String handle:handles) {
			driver.switchTo().window(handle);
			
			if(driver.getTitle().equals("Gmail")) {
				break;
			}
		}
		System.out.println(driver.getTitle());*/
		
		
		
	}

}
