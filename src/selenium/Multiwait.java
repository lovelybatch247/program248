package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiwait {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		//launch site
		driver.get("https://google.co.in");
		WebDriverWait w=new WebDriverWait(driver,20);
		ExpectedCondition ec1=ExpectedConditions.elementToBeClickable(By.name("q"));
		ExpectedCondition ec2=ExpectedConditions.elementToBeClickable(By.linkText("Gmail"));
		w.until(ExpectedConditions.and(ec1,ec2));
		System.out.println("Hello");

	}

}
