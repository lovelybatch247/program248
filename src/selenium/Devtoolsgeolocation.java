package selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Devtoolsgeolocation {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://the-internet.herokuapp.com/geolocation");
		//Display latitude and longitude value of current location
		driver.findElement(By.xpath("//button[starts-with(text(),'Where')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#lat-value")));
		String current_lat=driver.findElement(By.cssSelector("div#lat-value")).getText();
		String current_lon=driver.findElement(By.cssSelector("div#long-value")).getText();
		System.out.println("Latitude value of current location is : "+current_lat);
		System.out.println("Longitude value of current location is : "+current_lon);
		//Create DevTools session and set latitude and longitude values of desired location
		DevTools dt=driver.getDevTools();
		dt.createSession();
		HashMap<String, Object> params=new HashMap<>();
		params.put("latitude", 12.972442);
		params.put("longitude", 77.580643);
		params.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", params);
		//Get desired latitude and longitude values after change
		driver.findElement(By.xpath("//button[starts-with(text(),'Where')]")).click();
		String desired_lat=driver.findElement(By.cssSelector("div#lat-value")).getText();
		String desired_lon=driver.findElement(By.cssSelector("div#long-value")).getText();
		System.out.println("Latitude value of desired location is : "+desired_lat);
		System.out.println("Longitude value of desired location is : "+desired_lon);

		

	}

}
