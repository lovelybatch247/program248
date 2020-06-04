package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://in.yahoo.com");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//driver.findElement(By.name("username")).sendKeys("magnitiasdet",Keys.ENTER);
		WebElement e1=driver.findElement(By.name("username"));
		e1.sendKeys("magnitiasdet");
		//driver.findElement(By.name("signin")).click();
		RelativeBy b1=RelativeLocator.withTagName("input").below(e1);
		driver.findElement(b1).submit();
		String s1=driver.findElement(By.name("password")).getAttribute("magnitia");
		System.out.println(s1);
		String s2=driver.findElement(By.name("password")).getCssValue("color");
		System.out.println(s2);
		driver.close();
		

	}

}
