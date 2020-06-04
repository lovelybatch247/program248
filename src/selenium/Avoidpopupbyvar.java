package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Avoidpopupbyvar {

	public static void main(String[] args) {
		//Open chrome browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Launch site by giving credentials via URL to avoid authentication pop up window using variables 
		String uid="admin";
		String pwd="admin";
		driver.get("http://"+uid+":"+pwd+"@the-internet.herokuapp.com/basic_auth");

	}

}
