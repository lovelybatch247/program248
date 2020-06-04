package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pseudoelement {

	public static void main(String[] args) throws Exception {
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.goindigo.in/");
		//Get details of radio button(Pseudo element::before) before select
		String bc1=(String)driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ " var pe=window.getComputedStyle(ne,'::before');"
				+ " var x=pe.getPropertyValue('border-color');"
				+ " return(x);");
		String bgc1=(String)driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ " var pe=window.getComputedStyle(ne,'::before');"
				+ " var y=pe.getPropertyValue('background-color');"
				+ " return(y);");
		System.out.println(bc1+" "+bgc1);
		//Select radio button(Pseudo element)
		driver.findElement(By.xpath("//*[@for='roundTrip']")).click();
		//After select radio button(Pseudo element)
		String bc2=(String)driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ " var pe=window.getComputedStyle(ne,'::before');"
				+ " var x=pe.getPropertyValue('border-color');"
				+ " return(x);");
		String bgc2=(String)driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ " var pe=window.getComputedStyle(ne,'::before');"
				+ " var y=pe.getPropertyValue('background-color');"
				+ " return(y);");
		System.out.println(bc2+" "+bgc2);
		Thread.sleep(2000);
		Actions a =new Actions(driver);
		//a.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"I")).build().perform();
		a.contextClick().perform();
		//Dimension d=new Dimension(794, 7674);
		//driver.manage().window().setSize(d);
		
	}

}
