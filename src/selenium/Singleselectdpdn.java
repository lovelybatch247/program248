package selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Singleselectdpdn {

	public static void main(String[] args) throws Exception {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		//Close the popup window
		driver.findElement(By.xpath("//button[@aria-label='Close']/span")).click();
		//Locate Type of Holiday drop down 
		WebElement e=driver.findElement(By.name("theme"));
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
			//e.click();
			s.getWrappedElement().click();
			//Get page screenshot
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\LOVELY\\selenium20\\Screenshot.png");
			FileHandler.copy(src, dest);
		}
		//Close site
		driver.close();
	}

}
