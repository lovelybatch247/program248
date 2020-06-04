package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardautomation  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.name("password")).sendKeys("mag");
		//driver.findElement(By.name("password")).clear();
		WebElement e1=driver.findElement(By.name("email"));
		e1.sendKeys("magnitia");
		e1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//Thread.sleep(2000);
		e1.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//driver.findElement(By.name("confirmPassword")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		Runtime.getRuntime().exec("notepad.exe");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		/*Dimension d=driver.manage().window().getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		int x = (d.getWidth()/4)+20; 
		int y = (d.getHeight()/10)+50; 
		r.mouseMove(x, y);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);*/
	

		
		
		//r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		//r.keyPress(KeyEvent.VK_ENTER);
		
		
		//driver.close();
	}

}
