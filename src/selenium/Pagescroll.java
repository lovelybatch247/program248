package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagescroll {

	public static void main(String[] args) throws Exception {
		// Open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		//Change browser window size
		Dimension d=new Dimension(700,500);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//Scroll down
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//Scroll up
		driver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//Scroll right
		driver.executeScript("window.scrollBy(document.body.scrollWidth,0);");
		Thread.sleep(5000);
		//Scroll left
		driver.executeScript("window.scrollBy(-(document.body.scrollWidth),0);");
		Thread.sleep(5000);
		//Scroll to specific element
		WebElement e=driver.findElement(By.name("q"));
		driver.executeScript("arguments[0].scrollIntoView()",e);
		
		
	}

}
