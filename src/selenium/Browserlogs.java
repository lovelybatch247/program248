package selenium;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;

public class Browserlogs {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.magnitia.com/");
		//Maximize browser window
		driver.manage().window().maximize();
		//driver.manage().ime().activateEngine("pinyin");
		//Display browser logs
		List<LogEntry> logs=driver.manage().logs().get("browser").getAll();
		System.out.println("Total no of logs :" +logs.size());
		for(LogEntry log:logs) 
		{
			System.out.println(log.getMessage()+" "+log.getTimestamp());
		}
		
	}

}
