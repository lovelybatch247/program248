package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allselectedoptions {

	public static void main(String[] args) {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Locate multiselect dropdown
		WebElement e=driver.findElement(By.name("multipleselect[]"));
		//Select multiple values
		Select s=new Select(e);
		s.selectByIndex(3);
		s.selectByVisibleText("Manual Testing");
		s.selectByValue("msagile");
		//Get all selected items and display
		List<WebElement> items=s.getAllSelectedOptions();
		System.out.println("Total no of selected items:"+items.size());
		for(WebElement item:items)
		{
			System.out.println(item.getText().trim());
		}

	}

}
