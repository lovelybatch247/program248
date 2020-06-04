package selenium;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiemethods {

	public static void main(String[] args) throws Exception{
		//Get some data to search from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some data: ");
		String data=sc.nextLine();
		//Open browser 
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Collect all cookies before launch site
		Set<Cookie> cs=driver.manage().getCookies();
		//Display total no of cookies
		System.out.println("Total no of cookies: "+cs.size());
		//Display all cookies with name,value and domain
		System.out.println("Cookies are: ");
		for(Cookie c:cs)
		{
			System.out.println(c.getName()+"-->"+c.getValue()+"-->"+c.getDomain());
		}
		//Launch site
		driver.get("https://www.google.co.in/");
		//Maximize browser window
		driver.manage().window().maximize();
		//Enter data in search box
		driver.findElement(By.name("q")).sendKeys(data,Keys.ENTER);
		//Go to Images
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		//Collect all cookies 
		Set<Cookie> s=driver.manage().getCookies();
		//Display total no of cookies
		System.out.println("Total no of cookies: "+s.size());
		//Display all cookies
		System.out.println("Cookies are: ");
		for(Cookie ck:s)
		{
			System.out.println(ck.getName()+"-->"+ck.getValue()+"-->"+ck.getDomain());
		}
		//Get specific cookie by name
		Cookie cookie=driver.manage().getCookieNamed("1P_JAR");
		System.out.println("Cookie is: "+cookie);
		//Add new cookie
		Cookie nc=new Cookie("myCookie", "30009");
		driver.manage().addCookie(nc);
		//Collect all cookies after adding new cookie
		Set<Cookie> s1=driver.manage().getCookies();
		for(Cookie ck1:s1)
		{
			System.out.println(ck1.getName()+"-->"+ck1.getValue()+"-->"+ck1.getDomain());
		}
		//Delete specific cookie by giving name
		driver.manage().deleteCookieNamed("UULE");
		//Delete specific cookie by giving Cookie class object
		//Cookie ec=driver.manage().getCookieNamed("myCookie");
		//driver.manage().deleteCookie(ec);
		//Collect all cookies after deleting cookies
		Set<Cookie> s2=driver.manage().getCookies();
		//No of cookies after deletion
		System.out.println("Total no of cookies after deletion: "+s2.size());
		for(Cookie ck2:s2)
		{
			System.out.println(ck2.getName()+"-->"+ck2.getValue()+"-->"+ck2.getDomain());
		}
		//Close site
		//driver.close();
	}
}
