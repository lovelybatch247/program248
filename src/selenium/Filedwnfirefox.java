package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filedwnfirefox 
{

	public static void main(String[] args) throws Exception 
	{
		//create an empty folder
		File fo=new File("C:\\LOVELY\\selenium20\\my_downloads");
		fo.mkdir();
		//define preferences for firefox browser
		FirefoxProfile profile=new FirefoxProfile();
		//Set a folder path to save file to be download
		profile.setPreference("browser.download.dir",fo.getAbsolutePath());
		//1 means downloads folder,2 means given folder
		profile.setPreference("browser.download.folderList",2);
		//Stop pop-up windows which indicate file download
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("pdfjs.disabled",true);
		//Set MIME type
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/java-archieve");
		FirefoxOptions ffo=new FirefoxOptions();
		ffo.setProfile(profile);
		//open browser
		System.setProperty("webdriver.gecko.driver","C:\\LOVELY\\selenium20\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver(ffo);
	    driver.manage().window().maximize();
	    //launch site
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
