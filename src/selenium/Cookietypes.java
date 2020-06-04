package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookietypes {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.google.co.in/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Go to target page
		driver.get("https://www.google.co.in/");
		//collect all cookies related to this page
		Set<Cookie> cl=driver.manage().getCookies();
		ArrayList<Cookie> l1=new ArrayList<Cookie>(cl);
		System.out.println("Total no of cookies are :"+l1.size());
		for(Cookie c:l1)
		{
			if(c.isHttpOnly())
			{
				System.out.println(c.getName()+"is Http-only cookie");
			}
			else if(c.isSecure())
			{
				System.out.println(c.getName()+"is Secure cookie");
			}
			else if(c.getName().equalsIgnoreCase("session-id"))
			{
				System.out.println(c.getName()+"is Session cookie");
			}	
			else if(c.getName().equalsIgnoreCase("session-id-time"))
			{
				System.out.println(c.getName()+"is Persistent cookie");
			}
			else if(c.getDomain().contains("google.com"))
			{
				System.out.println(c.getName()+"is Super cookie");
			}
			else if(c.getDomain().contains("gmail.com"))
			{
				System.out.println(c.getName()+"is Same-site cookie");
			}
			else 
			{
				System.out.println(c.getName()+"is Third-party cookie");
			}
		}
		
		//close site
		driver.close();
	}
}
