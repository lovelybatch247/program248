package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		 // JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//open naukri site
		driver.get("https://www.naukri.com/");
		//Do login
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.name("email")).sendKeys("lovely102panda@gmail.com");
		driver.findElement(By.name("PASSWORD")).sendKeys("lovely93@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		//Edit profile using resume update
		Actions action=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//div[text()='My Naukri']"));
		action.moveToElement(e1).perform();
		
		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
		//WebDriverWait wait = new WebDriverWait(driver,120);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Edit Profile']")));
	
		
		WebElement updateFile = driver.findElement(By.xpath("//input[@id='attachCV']"));
		updateFile.sendKeys("C:/LOVELY/selenium20/chromedriver_win32 (1)/Resume (1).docx");
		action.moveToElement(e1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.close();
	    
	}

}
