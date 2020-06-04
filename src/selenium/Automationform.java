package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("Pragyan");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("14-03-2020");
		driver.findElement(By.xpath("//input[starts-with(@value,'Au')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Webdriver')]")).click();
		WebElement e1=driver.findElement(By.name("continents"));
		Select sc1=new Select(e1);
		sc1.selectByVisibleText("Europe");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement e2 = driver.findElement(By.xpath("//option[text()='Wait Commands']"));
		js.executeScript("arguments[0].scrollIntoView(true);",e2);
		e2.click();
		driver.findElement(By.name("photo")).sendKeys("C:/LOVELY/selenium20/chromedriver_win32 (1)/img.jpg");
		//driver.findElement(By.linkText("Click here to Download File")).click();
		driver.findElement(By.name("submit")).click();
		driver.close();
		
	}

}
