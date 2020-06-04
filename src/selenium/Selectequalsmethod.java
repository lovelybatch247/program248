package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectequalsmethod {

	public static void main(String[] args) {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Locate multiselect dropdown
		WebElement msd=driver.findElement(By.name("multipleselect[]"));
		//Get address of select object
		Select ms=new Select(msd);
		int h1=ms.hashCode();
		System.out.println("Address of ms is:"+h1);
		//Locate single-select dropdown
		WebElement ssd=driver.findElement(By.name("dropdown"));
		//Get address of select object
		Select ss=new Select(ssd);
		int h2=ss.hashCode();
		System.out.println("Address of ss is:"+h2);
		//Test whether both dropdowns are same or not
		if(ms.equals(ss))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are different");
		}
		
	}

}
