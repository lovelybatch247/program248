package selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");
		int chl=0,cwl=0,cbl=0;
		List<WebElement> l1=driver.findElements(By.xpath("(//a)|(//link)|(//script)|(//base)|(//area)|(//href)|(//img)"));
		
		//List<WebElement> l2=new ArrayList<WebElement>();
		
		for(WebElement e:l1) {
			
			if(e.getAttribute("href")!=null) {
				//l2.add(e);
				String href_val=e.getAttribute("href");
				if(!href_val.equals("")) {
					if(href_val.startsWith("http")||href_val.startsWith("https")) {
						chl++;
						URL url=new URL(href_val);
						URLConnection con=url.openConnection();
						HttpURLConnection httpCon=(HttpURLConnection) con;
						// httpCon.setConnectTimeout(5000);
						 httpCon.connect();
						 String res=httpCon.getResponseMessage();
						 httpCon.disconnect();
						 if(res.equalsIgnoreCase("OK")||res.equalsIgnoreCase("Accepted")||res.equalsIgnoreCase("Found")||res.equalsIgnoreCase("200")||res.equalsIgnoreCase("202")||res.equalsIgnoreCase("302")) 
						 {
							 cwl++;
						 }
						 else {
							 cbl++;
							 System.out.println(href_val+":"+res);
						 }
						
					}
						
					}
				}
		
			
			
			}
		System.out.println("Count all link type elements:"+chl);
		System.out.println("Total no of working links: "+cwl);
		System.out.println("Total no of broken links: "+cbl);
		driver.close();
		
		}
	}


