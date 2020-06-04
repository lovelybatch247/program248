package selenium;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filedwnchrome 
{

	public static void main(String[] args) throws Exception 
	{
		//create an empty folder
		File fo=new File("C:\\LOVELY\\selenium20\\my_download");
	    fo.mkdir();
	    //Store preferences/arguments with values as pairs in a hashmap
	    HashMap<String,Object> hm=new HashMap<String,Object>();
	    hm.put("profile.default_content_settings.popups",0);
	    hm.put("download.default_directory",fo.getAbsolutePath());
	    //Set hash map pairs to chrome browser preferences
	    ChromeOptions co=new ChromeOptions();
	    co.setExperimentalOption("prefs",hm);
	    //"prefs" is fixed word
	    //open browser with given preferences
	    System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    //Launch site
	    driver.get("https://selenium.dev/");
	    WebDriverWait w=new WebDriverWait(driver,10);
	    w.until(ExpectedConditions.elementToBeClickable(By.linkText("Downloads")));
	    driver.findElement(By.linkText("Downloads")).click();
	    w.until(ExpectedConditions.elementToBeClickable(By.linkText("3.141.59")));
	    driver.findElement(By.linkText("3.141.59")).click();
	    Thread.sleep(10000);//required for complete downloading
	    driver.close();
	    
	    
	}

}
