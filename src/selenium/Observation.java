package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Observation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.gmail.com");
		WebElement e1=driver.findElement(By.name("identifier"));
		String tag_userid=e1.getTagName();
		WebElement e2=driver.findElement(By.name("hiddenPassword"));
		String tag_password=e2.getTagName();
		System.out.println(tag_userid);
		System.out.println(tag_password);
		if(e1.isDisplayed()) {
			if(e1.isEnabled()) {
				System.out.println("Userid is displaying in page and enabled");
			}
			else {
				System.out.println("Userid is displaying in page but disabled");
			}
		}
		else {
			System.out.println("Userid is not displaying in page");
		}
		if(e2.isDisplayed()) {
			if(e2.isEnabled()) {
				System.out.println("Password is displaying in page and enabled");
			}
			else {
				System.out.println("Password is displaying in page but disabled");
			}
		}
		else {
			System.out.println("Password is not displaying in page");
		}
		driver.close();
	}

}
