package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	

	public static void main(String[] args) throws Exception {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Enter some text
		WebElement e1=driver.findElement(By.name("username"));
		Actions a1=new Actions(driver);
		a1.sendKeys(e1,"Hello").perform();
		Thread.sleep(5000);
		//Click on an element
		WebElement e2=driver.findElement(By.xpath("//input[@value='cbqtp']"));
		Actions a2=new Actions(driver);
		a2.click(e2).perform();
		Thread.sleep(5000);
		//Double click on an element
		WebElement e3=driver.findElement(By.linkText("Recent"));
		Actions a3=new Actions(driver);
		a3.doubleClick(e3).perform();
		Thread.sleep(5000);
		//Right click on an element
		WebElement e4=driver.findElement(By.linkText("Popular"));
		Actions a4=new Actions(driver);
		a4.contextClick(e4).perform();
		System.out.println("Hello action class");
		

	}

}
