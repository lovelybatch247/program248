package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framebyindex {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//Switch to the frame containing "Title bar(top.html)" text
		driver.switchTo().frame(2);
		//Verify title
		String expectedTitle="Title bar (top.html)";
		String actualTitle=driver.findElement(By.xpath("//h2")).getText();
		//System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle)) 
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
		//Switch to default content
		driver.switchTo().defaultContent();
		//Check main page title is “Sample frames page”
		String expected_maintitle="Sample frames page";
		String actual_maintitle=driver.getTitle();
		//System.out.println(actual_maintitle);
		if(expected_maintitle.equals(actual_maintitle)) 
		{
			System.out.println("Main page Title is same");
		}
		else
		{
			System.out.println("Main page Title is not same");
		}
		
	}

}
