package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"magnitia"));
		/*e.sendKeys(Keys.chord(Keys.SHIFT,"a"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"g"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"n"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"i"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"t"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"i"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"a"));*/
		driver.findElement(By.name("btnK")).click();
		driver.navigate().back();
		e=driver.findElement(By.name("q"));
		e.sendKeys(Keys.chord("100",Keys.SHIFT,"4",Keys.SPACE,"in",Keys.SPACE,"rupees"));
		
		/*e.sendKeys(Keys.chord(Keys.SHIFT,"4"));
		e.sendKeys(Keys.SPACE);
		e.sendKeys("in");
		e.sendKeys(Keys.SPACE);
		e.sendKeys("rupees");*/
		driver.findElement(By.name("btnK")).click();
		//driver.close();
		
		
	}

}
