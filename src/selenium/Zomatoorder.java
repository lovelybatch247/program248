package selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatoorder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Food')]")).click();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//div[@class='ta-right floating search_result_rating col-s-3 col-l-4 right pr0']/child::div[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='ta-right floating search_result_rating col-s-3 col-l-4 right pr0']")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@id='orig-search-list'][1]")).getText());
		//List<WebElement> rating_list=driver.findElements(By.xpath("//a[@data-result-type='ResCard_Name']"));
		List<WebElement> rating_list=driver.findElements(By.xpath("//div[@data-variation='mini inverted']"));
		//System.out.println(rating_list.size());
		double max=0;
		for(WebElement rl:rating_list) {
			//System.out.println(rl.getText());
			double m=Double.parseDouble(rl.getText());
			//System.out.println(m);
			if(m>max) {
				max=m;
			}
			
		}
		System.out.println(max);
		String max_rating=Double.toString(max);
		System.out.println(max_rating);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'4.4')]/ancestor::div[1]/preceding-sibling::div/descendant::div[1]/a")).getText());
		String parentWindow=driver.getWindowHandle();
		//System.out.println(parentWindow);
		driver.findElement(By.xpath("//div[contains(text(),'4.4')]/ancestor::div[1]/preceding-sibling::div/descendant::div[1]/a")).click();
		
		Set<String> handles=driver.getWindowHandles();
		//System.out.println(handles);
		for(String windowHandle:handles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				WebElement e=driver.findElement(By.xpath("//a[text()='Overview']"));
				e.click();
				
			}
		}
		//js.executeScript("arguments[0].scrollIntoView;",e);
		//WebElement e=driver.findElement(By.xpath("//a[text()='Overview']"));
		//e.click();
		WebElement e1=driver.findElement(By.xpath("//h5[text()='Direction']/following-sibling::p"));
		System.out.println(e1.getText());
		driver.findElement(By.linkText("Order Online")).click();
		driver.findElement(By.xpath("//section[@role='tablist']/ancestor::article/following::p[5]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//h4[text()='Mutton Seekh Kebab']/parent::div/following::span[1]")).click();
		//driver.findElement(By.xpath("//span[text()='Continue']")).click();
		/*String expectedText1="Paradise Biriyani";
		String actualText1=driver.findElement(By.xpath("//p[text()='ORDER FROM']/following-sibling::p[1]")).getText();
		String expectedText2="Mutton Seekh Kebab";
		String actualText2=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::p")).getText();
		String expectedText3="₹359";
		String actualText3=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::span[1]")).getText();*/
		
	}

}
