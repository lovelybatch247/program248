package selenium;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdpdn {

	public static void main(String[] args) throws Exception {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		//Locate Choose a car dropdown
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		//Check whether single-select or multi-select
		if(s.isMultiple())
		{
			System.out.println("Multi-select drop down");
		}
		else
		{
			System.out.println("Single-select drop down");
		}
		//Select items in multi-select dropdown
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(2)).click(s.getOptions().get(0)).click(s.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		s.deselectByIndex(2);
		Thread.sleep(5000);
		s.deselectByValue("audi");
		Thread.sleep(5000);
		s.deselectByVisibleText("Volvo");
		//Thread.sleep(5000);
		//s.deselectAll();
		//Collect all items
		List<WebElement> items=s.getOptions();
		int noi=items.size();
		System.out.println("The no of items in drop down: "+noi);
		//Copy all items text into two arrays
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		for(int i=1;i<noi;i++)
		{
			al1.add(items.get(i).getText());
			al2.add(items.get(i).getText());
			
		}
		//Sort second array
		Collections.sort(al2);
		//Compare first and second array
		int flag=0;
		for(int i=0;i<al2.size();i++)
		{
			if(!al1.get(i).equals(al2.get(i)))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Dropdown items are in sorted order");
		}
		else
		{
			System.out.println("Dropdown items are not in sorted order");
			//Click on drop down to get visibility of items
			e.click();
			//Get page screenshot
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\LOVELY\\selenium20\\Screenshot.png");
			FileHandler.copy(src, dest);
		}

		//Close site
		driver.close();
	}

}
