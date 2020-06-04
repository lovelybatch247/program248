package selenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		//Take input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some text:");
		String x=sc.nextLine();	
		// Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Launch site
		driver.get("https://www.google.co.in");
		//Do parameterization
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		int pagenumber=0;
		int allres=0;
		int resperpage;
		//infinite loop
		while(2>1) {
			resperpage=0;
			pagenumber++;
			List<WebElement> l=driver.findElements(By.xpath("//div[@class='rc']"));
			for(WebElement e:l) {
				if(e.isDisplayed()) {
					resperpage++;
				}
				
			}
			System.out.println("Total results of page "+pagenumber+" is: "+resperpage);
			
			allres=allres+resperpage;
			
			try {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			catch(Exception e) {
				System.out.println("Total results of all pages is :"+allres);
				break;
			}
		}
		
		
	}

}
