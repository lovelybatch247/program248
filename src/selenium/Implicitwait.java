package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Launch yahoo site
		driver.get("https://mail.yahoo.com/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Do login
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("pragyan93");
		driver.findElement(By.name("signin")).submit();
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("pragyan1993",Keys.ENTER);
		//driver.findElement(By.name("verifyPassword")).submit();
	}

}
