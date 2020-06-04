package selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contenttest {

	public static void main(String[] args) throws Exception {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Search for a word
		driver.findElement(By.name("q")).sendKeys("lovely",Keys.ENTER);
		Thread.sleep(5000);
		//get inner text of page
		String text=(String)driver.executeScript("return(document.documentElement.innerText);");
		System.out.println(text);
		//define regular expression/pattern matching
		Pattern p=Pattern.compile("[lL][oO][vV][eE][lL][yY]");
		Matcher m=p.matcher(text);
		int count=0;
		while(m.find())
		{
			count=count+1;
		}
		System.out.println("Count of matches of given word is: "+count);
		//close site
		driver.close();
	}

}
