package selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.locators.RelativeLocator;

import junit.framework.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Zomato {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
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
			if(!(rl.getText()).contains("NEW")||!(rl.getText()).contains("-")) {
				double m=Double.parseDouble(rl.getText());
				//System.out.println(m);
				if(m>max) {
					max=m;
				}
			}
			
			
		}
		System.out.println(max);
		String max_rating=Double.toString(max);
		System.out.println(max_rating);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'4.8')]/ancestor::div[1]/preceding-sibling::div/descendant::div[1]/a")).getText());
		String parentWindow=driver.getWindowHandle();
		//System.out.println(parentWindow);
		driver.findElement(By.xpath("//div[contains(text(),'4.8')]/ancestor::div[1]/preceding-sibling::div/descendant::div[1]/a")).click();
		
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
		String expectedName=driver.findElement(By.xpath("//a[text()='Casual Dining']/ancestor::section[2]/h1")).getText();
		String expectedPrice=driver.findElement(By.xpath("//h4[text()='Veg Thai Red Curry']/following::span[2]")).getText();
		WebElement ele=driver.findElement(By.xpath("//h4[text()='Veg Thai Red Curry']/parent::div/following::span[1]"));
		js.executeScript("arguments[0].click();",ele);
		
		//driver.findElement(By.xpath("//span[text()='Add to order -']/ancestor::button")).click();
		
		//driver.findElement(By.xpath("//span[text()='Continue']/ancestor::button")).click();
		driver.findElement(By.xpath("//span[text()='Add to order -']/ancestor::button")).click();
		driver.findElement(By.xpath("//span[text()='Continue']/ancestor::button")).click();
		//Verify Restaurant name
		
		
		String actualName=driver.findElement(By.xpath("//p[text()='ORDER FROM']/following-sibling::p[1]")).getText();
		Assert.assertEquals("Restaurant name Not same", expectedName, actualName);
		
		//Verify item price
		Thread.sleep(2000);
		
		String actualPrice=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::span[2]")).getText();
		Assert.assertEquals("Price Not same", expectedPrice, actualPrice);
		
		//Verify item price after quantity increase
		
		driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::span[2]/following::i[2]")).click();
		double d=Double.parseDouble(actualPrice.replace("₹", ""))*2;
		String expectedSubtotal=Double.toString(d).replaceFirst("","₹");
		System.out.println(expectedSubtotal);
		WebElement e2=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::p[3]"));
		//WebElement e2=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::p[3]"));
		
		String actualSubtotal=e2.getText();
		
		try {
			Assert.assertEquals(expectedSubtotal, actualSubtotal);
		}catch(AssertionError ae) {
			
			
			//Highlight defects
			
			js.executeScript("arguments[0].style.border='4px solid red'", e2);
			System.out.println("Take screenshot now");
			
			
			
			Screenshot ss=new AShot().takeScreenshot(driver);
			
			
			
			//Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
			File dest=new File("C:\\LOVELY\\selenium20\\"+filename);
			ImageIO.write(ss.getImage(),"png",dest);

		}
		
		//Verify Subtotal price after quantity increase
		
		
		String expectedtotal=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::p[3]")).getText();
		System.out.println(expectedtotal);
		WebElement e3=driver.findElement(By.xpath("//p[text()='Subtotal']/following::span[2]"));
		//WebElement e2=driver.findElement(By.xpath("//p[text()='ORDER FROM']/parent::div/following::p[3]"));
		
		String actualtotal=e3.getText();
		
		try {
			Assert.assertEquals(expectedtotal, actualtotal);
		}catch(AssertionError ae) {
			
			
			//Highlight defects
			
			js.executeScript("arguments[0].style.border='4px solid red'", e3);
			System.out.println("Take screenshot now");
			
			
			
			Screenshot ss=new AShot().takeScreenshot(driver);
			
			
			
			//Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
			File dest=new File("C:\\LOVELY\\selenium20\\"+filename);
			ImageIO.write(ss.getImage(),"png",dest);

		}
		
		//verify grandTotal price
		WebElement e4=driver.findElement(By.xpath("//p[text()='Grand Total']/following::span"));
		String total_actual=e4.getText();
		String subtotal_expected=driver.findElement(By.xpath("//p[text()='Subtotal']/following::span[2]")).getText();
		String subtotal = subtotal_expected.replace("₹", "");
		
		String packaging_expected=driver.findElement(By.xpath("//p[contains(text(),'Packaging')]/following-sibling::p")).getText();
		
		String packaging = packaging_expected.replace("₹", "");
		
		String taxes_expected=driver.findElement(By.xpath("//p[starts-with(text(),'T')]/following-sibling::p")).getText();
		String taxes = taxes_expected.replace("₹", "");
		//WebElement e=driver.findElement(By.xpath("//p[contains(text(),'Total')]/following::span[1]"));
		double total_expected=Double.parseDouble(subtotal)+Double.parseDouble(packaging)+Double.parseDouble(taxes);
		//System.out.println(total_expected);
		String total_price=Double.toString(total_expected);
		String total=total_price.replaceFirst("","₹" );
		System.out.println(total);
		//Assert.assertEquals("Total price Not same", total_expected, total);
		try {
			Assert.assertEquals(total, total_actual);
		}catch(AssertionError ae) {
			
			
			//Highlight defects
			
			js.executeScript("arguments[0].style.border='4px solid red'", e4);
			System.out.println("Take screenshot now");
			
			
			
			Screenshot ss=new AShot().takeScreenshot(driver);
			
			
			
			//Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
			File dest=new File("C:\\LOVELY\\selenium20\\"+filename);
			ImageIO.write(ss.getImage(),"png",dest);

		}
		 
	}

}
