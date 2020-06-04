package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
	
		// Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
	    ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//Locate <div> tag drop down and get it into visible area of desktop
		WebElement msd=driver.findElement(By.xpath("//a[@id='multiple-selection']//following-sibling::div"));
		WebElement neighbour1=driver.findElement(By.xpath("//h4[text()='Multiple Selection']"));
		driver.executeScript("arguments[0].scrollIntoView();",neighbour1);
		//Test case-1:Check for multi-select or not
		if(msd.getAttribute("class").contains("multiple")) 
		{
			System.out.println("Dropdown is multiselect");
			//start testing
			//Test case-2:Collect all items in that multi-select drop down
			List<WebElement> items_msd=msd.findElements(By.xpath("child::div[2]/div"));
			System.out.println("Total no of items :"+items_msd.size());
			for(WebElement item:items_msd) 
			{
				//get invisible items text using java script
				String x_msd=(String)driver.executeScript("return arguments[0].textContent;",item);
				System.out.println(x_msd);
			}
			//open dropdown to get visibility of items
			msd.click();
			Thread.sleep(2000);
			//Test case-3:Select each item and test that selection and deselect that item
			for(WebElement item:items_msd)
			{
				try 
				{
					//check item for visibility
					if(item.isDisplayed()) 
					{
						//Remember text of that item to be selected
						String expectedText1=item.getText();
						
						Thread.sleep(2000);
						//select that item
						item.click();
						//get selected item text
						WebElement selectedItem1=msd.findElement(By.xpath("child::a"));
						String actualText1=selectedItem1.getText();
						
						//compare both remembered text and visible text of selected item
						if(expectedText1.equals(actualText1)) 
						{
							System.out.println(expectedText1+" item selection test Passed");
						}
						else 
						{
							System.out.println(expectedText1+" item selection test Failed");
						}
						Thread.sleep(2000);
						//Deselect that selected item
						selectedItem1.findElement(By.xpath("child::i")).click();
						
					}
					else 
					{
						String z=(String)driver.executeScript("return arguments[0].textContent();",item);
						System.out.println(z+" item is hidden");
					}
				}
				
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			Thread.sleep(2000);
			//close drop down
			msd.sendKeys(Keys.ESCAPE);
			Thread.sleep(2000);
			//Test case-4:Select multiple items and test
			for(int i=0;i<items_msd.size();i++) 
			{
			
			try {
				//open drop down to get visibility of items
				msd.click();
				Thread.sleep(2000);	
				if(items_msd.get(i).isDisplayed()) 
				{
					//Remember text of that item to be selected
					String expectedText3=items_msd.get(i).getText();
					
					//select that item
					items_msd.get(i).click();
					Thread.sleep(2000);
					//get selected item text 
					WebElement selectedItem3=msd.findElement(By.xpath("child::a["+i+"+1]"));
					String actualText3=selectedItem3.getText();
					
					//Compare both remembered text and visible text of selected item
					if(expectedText3.equals(actualText3)) {
						System.out.println(expectedText3+" item selection test Passed");
					}
					else
					{
						System.out.println(expectedText3+" item selection test Failed");
					}
				}
				else 
				{
					
					String w=(String)driver.executeScript("return arguments[0].textContent();",items_msd.get(i));
					System.out.println(w+" item is hidden");
				}
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
			Thread.sleep(2000);
			//close drop down
			msd.sendKeys(Keys.ESCAPE);

		}
		
		else 
		{
			System.out.println("Dropdown is single select");
			//start testing
			//Locate <div> tag drop down and get it into visible area of desktop
			WebElement ssd=driver.findElement(By.xpath("//a[@id='selection']//following-sibling::div[2]"));
			WebElement neighbour2=driver.findElement(By.xpath("//h4[text()='selection']"));
			driver.executeScript("arguments[0[.scrollIntoView();",neighbour2);
			//Test case-1:
			List<WebElement> items_ssd=ssd.findElements(By.xpath("child::div[2]//div"));
			System.out.println("Total no of items in the dropdown :"+items_ssd.size());
			for(WebElement item:items_ssd) {
				//get invisible items text using java script
				String x=(String)driver.executeScript("return arguments[0].textContent();",item);
				System.out.println(x);
			}
			//Select each item in the drop down and test that selection
			for(WebElement item:items_ssd) 
			{
				try 
				{
					//open drop down to get visibility of items
					ssd.click();
					Thread.sleep(2000);
					//check item for visibility
					if(item.isDisplayed()) 
					{
						//Remember text of that item to be selected
						String expectedText2=item.getText();
						
						Thread.sleep(2000);
						//select that item
						item.click();
						//get selected item text
						WebElement selectedItem2=ssd.findElement(By.xpath("child::div[1]"));
						String actualText2=selectedItem2.getText();
						
						//compare both remembered text and visible text of selected item
						if(expectedText2.equals(actualText2)) 
						{
							System.out.println(expectedText2+" item selection test Passed");
						}
						else 
						{
							System.out.println(expectedText2+" item selection test Failed");
						}
					}
					else 
					{
						String y=(String)driver.executeScript("return arguments[0].textContent();",item);
						System.out.println(y+" item is hidden");
					}
				}
				
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
		
	}	

}
