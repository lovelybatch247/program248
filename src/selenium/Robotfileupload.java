package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robotfileupload {

	public static void main(String[] args) throws Exception {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Launch gmail site
		driver.get("https://www.gmail.com/");
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("ritika60magnitia");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("ritika@60");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Compose mail
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		//Fill fields
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		driver.findElement(By.name("to")).sendKeys("lovely102panda@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Resume");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi \n I have attached my resume below.Please check it and let me know if anything is required.\nThank you,\n Pragyan");
		//Go to attachment by clicking on attachment icon
		driver.findElement(By.xpath("//div[@aria-label='Attach files']")).click();
		Thread.sleep(5000);
		//Handle file upload window using Java Robot
		StringSelection s=new StringSelection("C:\\Users\\LOVELY\\Desktop\\Resume\\PragyanPanda.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		
		
	}

}
