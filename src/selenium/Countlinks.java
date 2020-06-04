package selenium;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");
		List<WebElement> l1=driver.findElements(By.xpath("(//a)|(//link)|(//script)|(//base)|(//area)|(//href)|(//img)"));
		System.out.println(l1.size());
		List<WebElement> l2=new ArrayList<WebElement>();
		for(WebElement e:l1) {
			if(e.getAttribute("href")!=null) {
				l2.add(e);
			}
		}
		System.out.println("Count all links having href attribute is:"+l2.size());
 	}

}
