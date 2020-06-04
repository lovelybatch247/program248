package selenium;

import java.io.File;


import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Pega {

	public static void main(String[] args) throws Exception {
		//Open browser
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		//Launch site
		driver.get("C:\\Users\\LOVELY\\Downloads\\Pega Case Manager Portal\\Pega Case Manager Portal.html");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("PegaGadget2Ifr");
		//Get dispute amount from VCR details
		WebElement e1=driver.findElement(By.xpath("//span[text()='Visa dispute ID']/parent::div/parent::div/following-sibling::div[1]/descendant::span[3]"));
		String s1=e1.getText();
		//Get dispute amount from Dispute details
		WebElement e2=driver.findElement(By.xpath("(//div[text()='Fraud questionnaire']/parent::div/parent::div/following-sibling::div/descendant::span)[3]"));
		String s2=e2.getText();
		//Get Pre-compliance amount from Pre-compliance details
		WebElement e3=driver.findElement(By.xpath("((//h2[text()='Pre-compliance details'])[2]//ancestor::div[@id='EXPAND-PLUSMINUS']//following-sibling::div[@id='EXPAND-INNERDIV']//descendant::span)[9]"));
		String s3=e3.getText();
		//Get Acquirer liable amount from Compliance details
		WebElement e4=driver.findElement(By.xpath("(//h2[text()='Compliance details']//ancestor::div[@id='EXPAND-PLUSMINUS']//following-sibling::div[@id='EXPAND-INNERDIV']//descendant::span)[3]"));
		String s4=e4.getText();
		//Get Case filing amount from Compliance ruling
		WebElement e5=driver.findElement(By.xpath("(//h2[text()='Compliance ruling']//ancestor::div[@id='EXPAND-PLUSMINUS']//following-sibling::div[@id='EXPAND-INNERDIV']//descendant::span)[3]"));
		String s5=e5.getText();
		//All values are same or not
		if(s2.equals(s1)&&s3.equals(s1)&&s4.equals(s1)&&s5.equals(s1))
		{
			System.out.println("All values are same");
		}
		else 
		{
			System.out.println("All are not same");
			System.out.println("take screenshot now");
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\LOVELY\\selenium20\\screenshot1.png");
			FileHandler.copy(src, dest);
		}
		//driver.close();
		
	}

}
