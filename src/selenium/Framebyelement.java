package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framebyelement {

	public static void main(String[] args) {
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//Locate frame containing "Title bar(top.html)" text
		WebElement frame_element=driver.findElement(By.name("main"));
		//Switch to that frame 
		driver.switchTo().frame(frame_element);
		//Verify title
		String expectedTitle="Title bar (top.html)";
		String actualTitle=driver.findElement(By.xpath("//h2")).getText();
				
		if(expectedTitle.equals(actualTitle)) 
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}

	}

}
