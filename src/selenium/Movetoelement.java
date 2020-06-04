package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com/");
		//Close banner
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//Move to an element
		WebElement e1=driver.findElement(By.xpath("//span[text()='Women']"));
		int x=e1.getLocation().getX();
		int y=e1.getLocation().getY();
		Actions a=new Actions(driver);
		//a.moveToElement(e1).perform();
		//a.moveToElement(e1, 10, 10).perform();
		a.moveByOffset(x, y);
		
	}

}
