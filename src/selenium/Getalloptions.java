package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getalloptions {

	public static void main(String[] args) {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		//Click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		//Locate country dropdown
		WebElement e=driver.findElement(By.name("country"));
		//Get all options
		Select s=new Select(e);
		List<WebElement> items=s.getOptions();
		//Display size of options in country dropdown
		System.out.println("Total no of options available in country dropdown is: "+items.size());
		//Display all items
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		
	}

}
