package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.lambdatest.com/register");
		driver.findElement(By.xpath("//input[@name='name' and @placeholder='Full Name*']")).sendKeys("Pragyan Priyadarshini Panda");
		driver.findElement(By.xpath("//input[@name='email' or @placeholder='Email*']")).sendKeys("lovely102panda@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'u')]")).sendKeys("lambdatest");
		driver.findElement(By.xpath("//input[contains(@placeholder,'hon')]")).sendKeys("9078785309");
		driver.findElement(By.xpath("//button[text()='Free Sign Up']")).click();
		//driver.close();
	}

}
