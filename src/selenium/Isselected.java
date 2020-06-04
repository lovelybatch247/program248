package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");
		WebElement e1=driver.findElement(By.xpath("//label[text()='One Way'][1]/preceding-sibling::input[1]"));
		
		Thread.sleep(2000);
		WebElement e3=driver.findElement(By.xpath("//label[text()=' Family and Friends']/preceding-sibling::input"));
		if(e1.isDisplayed()) {
			if(e1.isSelected()) {
				System.out.println("Radio button is displaying in page and selected");
			}
			else {
				System.out.println("Radio button is displaying in page but not selected");
			}
		}
		else {
			System.out.println("Radio button is not displaying in page");
		}
		
		if(e3.isDisplayed()) {
			if(e3.isSelected()) {
				System.out.println("Checkbox is displaying in page and checked");
			}
			else {
				System.out.println("Checkbox is displaying in page but not checked");
			}
		}
		else {
			System.out.println("Checkbox is not displaying in page");
		}
	}

}
