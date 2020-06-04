package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoomailsent {

	public static void main(String[] args) throws Exception {
		// Open browser and avoid browser driver logs
		//System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://in.yahoo.com/");
		
		//click on sign in button
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(5000);
		//Enter username and click on next button
		driver.findElement(By.name("username")).sendKeys("pragyan93");
		Thread.sleep(5000);
		driver.findElement(By.name("signin")).submit();
		Thread.sleep(5000);
		//enter password and click on next button
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pragyan1993",Keys.ENTER);
		Thread.sleep(5000);
		//open mail box
		driver.findElement(By.xpath("//a[@title='Mail']/span")).click();
		Thread.sleep(5000);
		//click on compose button
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(5000);
		//Fill fields 
		driver.findElement(By.xpath("//div[@data-test-id='compose-header-field-to']/descendant::input[@role='combobox']")).sendKeys("lovely102panda@gmail.com");
		//Thread.sleep(5000);
		
		//open a new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		//open gmail site
		//driver.get("");
		
		
	}

}
