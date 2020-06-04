package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowmanage {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of browsers: ");
		int n=sc.nextInt();
		int i;
		String browser[] = new String[n];
		WebDriver driver=null;
		System.out.println("Enter browser name: ");
		for(i=0;i<n;i++) 
		{
			browser[i]=sc.next();
		}
	
			for(i=0;i<n;i++)
			{	
				//String x ="ABC";
				//String y = "abc";
				//if(x.toLowerCase().equals(y))
				//switch(x.to)
				switch(browser[i].toLowerCase())
				{
					case "chrome":
						//Open chrome browser 
						System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
						driver=new ChromeDriver();
						break;
					case "firefox":
						
						//Open firefox browser 
						System.setProperty("webdriver.gecko.driver","C:\\LOVELY\\selenium20\\geckodriver-v0.26.0-win64\\geckodriver.exe");
						driver=new FirefoxDriver();
						break;
					case "edge":
					
						//Open egde browser 
						System.setProperty("webdriver.edge.driver","C:\\LOVELY\\selenium20\\edgedriver_win64\\msedgedriver.exe");
						driver=new EdgeDriver();
						break;
					default:
						System.out.println("Browser not found");
						continue;
				}
				//Thread.sleep(5000);
				//System.out.println(driver);
				//Full screen of browser window
				driver.manage().window().fullscreen();
				Thread.sleep(5000);
				//Minimize browser window
				driver.manage().window().minimize();
				//Thread.sleep(5000);
				//Launch site
				driver.get("https://www.craftsvilla.com/");
				//Thread.sleep(5000);
				//close browser
				driver.close();
				//Thread.sleep(5000);
			}

		
	}

}
