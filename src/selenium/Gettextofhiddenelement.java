package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextofhiddenelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement e1=driver.findElement(By.xpath("//div[text()='New']"));
		String a=e1.getAttribute("class");
		String c=e1.getCssValue("color");
		String t1=e1.getText();
		System.out.println(t1+" "+a+" "+c+" ");
		String t2=(String) driver.executeScript("return(arguments[0].textContent);",e1);
		System.out.println(t2+" "+a+" "+c+" ");
		//driver.findElement(By.className("//div[text()='File']/parent::div")).getText();
	}

}
