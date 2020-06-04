package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Myntra {

	public static void main(String[] args) throws Exception {
		// Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Maximize window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Launch site
		driver.get("https://www.myntra.com/");
		//Mouse hover an element(Women)
		Actions action=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//a[text()='Women' and @data-group='women']"));
		action.moveToElement(e1).perform();
		//Select Ethnic dresses
		driver.findElement(By.xpath("//a[text()='Ethnic Dresses']")).click();
		//Select products discount range 60% and above
		WebElement e2=driver.findElement(By.xpath("//input[@value='60.0 TO 100.0']"));
		js.executeScript("arguments[0].click()",e2);
		//Verify all items having discount 60% and above
		Thread.sleep(2000);
		List<WebElement> l=driver.findElements(By.xpath("//span[text()='FILTERS']/ancestor::div[3]/following-sibling::div/descendant::div[2]/following-sibling::div/descendant::a/child::div[2]/child::div/span[2]"));
		
		
		System.out.println(l.size());
		for(int i=1;i<=l.size();i++) {
			WebElement l1=driver.findElement(By.xpath("(//span[text()='FILTERS']/ancestor::div[3]/following-sibling::div/descendant::div[2]/following-sibling::div/descendant::a/child::div[2]/child::div/span[2])["+i+"]"));
			String discount=l1.getText();
			int dis=Integer.parseInt(discount.replaceAll("[^0-9]",""));
			System.out.println(dis);
			if(dis>=60) {
					System.out.println("discount 60% or above");
			}
			else {
					System.out.println("discount below 60%");
			}	
		}
		//int count=0;
		
			/*for(int i=1;i<=l.size();i++) {
				WebElement l1=driver.findElement(By.xpath("(//span[text()='FILTERS']/ancestor::div[3]/following-sibling::div/descendant::div[2]/following-sibling::div/descendant::a/child::div[2]/child::div/span[2])["+i+"]"));
				String discount=l1.getText();
			    int dis=Integer.parseInt(discount.replaceAll("[^0-9]",""));
			    System.out.println(dis);
				if(dis>=60) {
					System.out.println("discount 60% or above");
				}
				else {
					System.out.println("discount below 60%");
				}	
				
				
			}*/
			
			//driver.findElement(By.xpath("//a[text()='Next']")).click();
			
	}
}
