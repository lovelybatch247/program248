package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws Exception {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		//Switch to frame
		WebElement f=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		//Horizontal slider
		WebElement hs=driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions a=new Actions(driver);
		//Left to right
		a.dragAndDropBy(hs,100,0).perform();
		Thread.sleep(5000);
		//Right to left
		a.dragAndDropBy(hs,-40,0).perform();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		//Click on Vertical slider link
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(5000);
		//Switch to frame
		WebElement f1=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f1);
		//driver.switchTo().frame(0);
		//Vertical slider
		WebElement vs=driver.findElement(By.xpath("//div[@id='slider-vertical']/span"));
		//Top to bottom
		a.dragAndDropBy(vs, 0,60).perform();
		Thread.sleep(5000);
		//Bottom to top
		a.dragAndDropBy(vs, 0,-90).perform();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}

}
