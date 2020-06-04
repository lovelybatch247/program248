package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmaillink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		//Before focus
		String p1=e1.getCssValue("text-decoration");
		String q1=e1.getCssValue("opacity");
		System.out.println(p1);
		System.out.println(q1);
		//Send mouse focus to element
		Actions action=new Actions(driver);
		action.moveToElement(e1).perform();
		//After focus
		String p2=e1.getCssValue("text-decoration");
		String q2=e1.getCssValue("opacity");
		System.out.println(p2);
		System.out.println(q2);
		//Validations
		if(p2.contains("underline")) {
			System.out.println("Underline came after mouse hover,so test passed");
		}
		else
		{
			System.out.println("No underline came after mouse hover,so test failed");
		}
		float f=Float.parseFloat(q2);
		if(f!=1) {
			System.out.println("Color shaded after mouse hover,so test passed");
		}
		else
		{
			System.out.println("No color shade after mouse hover,so test failed");
		}
		driver.close();
	}

}
