package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoalert2 {

	public static void main(String[] args) throws Exception {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//Maxmize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(5000);
		//Enter customer id
		WebElement cid=driver.findElement(By.name("cusid"));
		cid.sendKeys("12345");
		Thread.sleep(5000);
		//Click on reset button
		driver.findElement(By.name("res")).click();
		Thread.sleep(5000);
		//Enter customer id again
		cid.sendKeys("30009");
		Thread.sleep(5000);
		//Click on submit button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		//Switch to alert and click on cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		//Click on reset button
		driver.findElement(By.name("res")).click();
		Thread.sleep(5000);
		//Enter customer id again
		cid.sendKeys("30001");
		Thread.sleep(5000);
		//Click on submit button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		//Switch to alert and click on ok button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		//Switch to alert and get text
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Text showing on alert popup :"+text);
		Thread.sleep(5000);
		//Click on ok button
		alert.dismiss();

	}

}
