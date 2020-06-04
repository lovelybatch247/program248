package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoalert1 {

	public static void main(String[] args) throws Exception{
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//Maxmize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		Thread.sleep(5000);
		//Click on Generate alert box button
		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		//Click on Generate confirm box button
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}
