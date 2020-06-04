package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid19 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/#countries");
		
		List<WebElement> countries=driver.findElements(By.xpath("//table[contains(@id,'today')]/tbody[1]//a"));
		//String snc[]=new String[countries.size()];
		for(WebElement country:countries)
		{
			//int i;
			//System.out.println(country.getText());
			WebElement nc=country.findElement(By.xpath("parent::td/following-sibling::td[2]"));
			/*for(i=0;i<snc.length;i++) 
			{
				snc[i]=nc.getText();
				System.out.println(Arrays.toString(snc));
				break;
			}
			*/
			
			System.out.println(country.getText()+" -> "+nc.getText());
		}
	
	}

}
