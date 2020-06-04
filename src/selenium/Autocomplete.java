package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete 
{

	public static void main(String[] args) throws Exception 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search:");
		String word=sc.nextLine();
		//open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		//Enter that word in search box
		driver.findElement(By.name("q")).sendKeys(word);
		Thread.sleep(5000);
		//Test case-1:Locate cache/autocomplete element and collect all suggestions in it
		WebElement autocomplete=driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> suggestions=autocomplete.findElements(By.xpath("child::li"));
		System.out.println("Count of suggestions is :"+suggestions.size());
		System.out.println("Suggestions are :");
		for(WebElement suggestion:suggestions)
		{
			System.out.println(suggestion.getText());
		}
		//Test case-2:Check each suggestion which contains given word or not
		int flag=0;
		for(WebElement suggestion:suggestions) 
		{
			if(!suggestion.getText().contains(word))
			{
				flag=1;
			}
		}//for loop ending
		if(flag==0)
		{
			System.out.println("Cache is correct for given "+word);
		}
		else
		{
			System.out.println("Cache is incorrect for given "+word);
		}
		//Test case-3:Each suggestion selection testing
		for(WebElement suggestion:suggestions)
		{
			//1.get text of suggestion to be selected
			String expected=suggestion.getText();
			//2.Down arrow to get suggestion
			driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
			//3.get selected suggestion text
			String actual=driver.findElement(By.name("q")).getAttribute("value");
			//4.compare both expected and actual
			if(expected.equals(actual)) 
			{
				System.out.println("\""+expected+"\" suggestion selection test passed");
			}
			else 
			{
				System.out.println("\""+expected+"\" suggestion selection test failed");
			}
			Thread.sleep(2000);
		}
		//close site
		driver.close();
	}

}
