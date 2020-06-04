import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import com.thoughtworks.selenium.DefaultSelenium;
//import com.thoughtworks.selenium.Selenium;
//import kotlin.contracts.Returns;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import org.junit.Assert;
import org.junit.Before;

/*import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;*/
//run with Parameterized class with Junit
@RunWith(Parameterized.class)
public class Seleniumeasy {
	public  WebDriver driver;
	//Define browser
	private String browser;
	//private Selenium selenium;
	//Create a constructor with browser
	public Seleniumeasy(String browser) {
		this.browser=browser;
	}
	//Define each browser as a parameter
	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{{"chrome"}});//,{"firefox"},{"edge"}
	}
	
	
	@Before
	public  void openBrowser() {
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		System.out.println("driver value in before method "+driver);
	}

	
	@Test @Ignore
	
	public void assertText() {
		
		String expectedText="Selenium Easy";
		//String actualText=driver.findElement(By.xpath("//a[text()='Selenium Easy']")).getText();
		String actualText=driver.findElement(By.xpath("//div[@id='site-name']//a")).getText();
		//System.out.println(actualText);
		Assert.assertEquals("Selenium Easy text is not present", expectedText, actualText);
		
			
	}
	
	@Rule
	public ScreenShotOnFailure sc = new ScreenShotOnFailure(driver,browser);
	@Test @Ignore
	public void assertTextSlide() {
		try {
			driver.findElement(By.xpath("//div[@id='first-slider']//li[@data-slide-to=0]")).click();
		}catch(NoSuchElementException ne){
			System.out.println("No Exception");
		}
		WebDriverWait wait=new WebDriverWait(driver,20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-9 text-left']/h3")));
		String text1=driver.findElement(By.xpath("//div[@class='col-md-9 text-left']/h3")).getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-9 text-left']/h4")));
		String text2=driver.findElement(By.xpath("//div[@class='col-md-9 text-left']//h4")).getText();
		System.out.println(text1+"\n"+text2);
		
		
		
		
	}
	
	@Test 
	
	public void checkboxDemo() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("//a[text()=' Start Practising ']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		
		/*WebElement ele = driver.findElement(By.xpath("//a[text()='Check Box Demo']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);*/
		
		driver.findElement(By.xpath("//a[text()='Check Box Demo']")).click();
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		String expectedCheckboxtext="Success - Check box is checked";
		String actualCheckboxtext=driver.findElement(By.id("txtAge")).getText();
		Assert.assertEquals("Success - Check box is checked message is not present",expectedCheckboxtext, actualCheckboxtext);
		driver.findElement(By.id("check1")).click();
		String expectedCheckboxtext1="Uncheck All";
		String actualCheckboxtext1=driver.findElement(By.id("check1")).getAttribute("value");
		//System.out.println(actualCheckboxtext1);
		Assert.assertEquals("Uncheck All is not present",expectedCheckboxtext1, actualCheckboxtext1);
		driver.findElement(By.xpath("//input[@class='cb1-element']")).click();
		String expectedCheckboxtext2="Check All";
		WebElement e=driver.findElement(By.id("check1"));
		String actualCheckboxtext2=e.getAttribute("value");
		//System.out.println(actualCheckboxtext1);
		//String str="Check All is not present";
		//Assert.assertEquals(str,expectedCheckboxtext2, actualCheckboxtext2);
		//driver.navigate().back();
		//Assert.assertTrue(actualCheckboxtext2.contains(expectedCheckboxtext2));
		Assert.assertEquals(expectedCheckboxtext2, actualCheckboxtext2);
		//try {
			//Assert.assertEquals(expectedCheckboxtext2, actualCheckboxtext2);
		//}catch(AssertionError ae) {
			
			
			//Highlight defects
			
			//js.executeScript("arguments[0].style.border='4px solid red'", e);
			//System.out.println("Take screenshot now");
			
			//Take screenshot of only element
			
			/*File src=e.getScreenshotAs(OutputType.FILE);
			String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
			File dest=new File("C:\\LOVELY\\selenium20\\"+filename);
			FileHandler.copy(src, dest);*/
			
			//Take screenshot of entire screen
			
			//Screenshot ss=new AShot().takeScreenshot(driver);
			
			//Take screenshot of entire page with scrolling
			
			/*Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
			File dest=new File("C:\\LOVELY\\selenium20\\"+filename);
			ImageIO.write(ss.getImage(),"png",dest);*/

		//}
		 
		
			
		
			
		
		
}
	

	
	@Test @Ignore
	public void javascriptAlerts() {
		//driver.navigate().back();
		WebDriverWait wait=new WebDriverWait(driver, 20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Start Practising ']")));
		driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Javascript Alerts']")).click();
		
		driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']/following-sibling::button")).click();
		
		try {
		    WebDriverWait wait1 = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    alert.accept();
		} catch (Exception e) {
		    //exception handling
		}
       
        driver.findElement(By.xpath("//b[text()='Click the button to display an confirm box:']/following-sibling::button")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        String expectedConfirmboxtext="You pressed OK!";
        String actualConfirmboxtext=driver.findElement(By.id("confirm-demo")).getText();
        Assert.assertEquals("You pressed OK! is not present",expectedConfirmboxtext, actualConfirmboxtext);
        driver.findElement(By.xpath("//b[text()='Click below button for prompt box.']/following-sibling::button")).click();
        driver.switchTo().alert().sendKeys("Pragyan");
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        String expectedPromptboxtext="You have entered 'Pragyan' !";
        String actualPromptboxtext=driver.findElement(By.id("prompt-demo")).getText();
        Assert.assertEquals("You have entered 'Pragyan' ! is not present",expectedPromptboxtext, actualPromptboxtext);
	}
	
	
	
	
	
	
	
	@After
	
	public  void closeBrowser() {
		
		driver.quit();
	}
}

	
	/*System.setProperty("webdriver.chrome.driver","C://Users//LOVELY//Downloads//chromedriver_win32//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/");
	String str1=driver.findElement(By.xpath("//a[text()='Selenium Easy']")).getText();
	String str2="Selenium Easy";
	@Test
	
	public void test1() {
		
		if(Assert.assertEquals(str2, str1)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}*/
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//LOVELY//Downloads//chromedriver_win32//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		String str1=driver.findElement(By.xpath("//a[text()='Selenium Easy']")).getText();
		String str2="Selenium Easy";
		@Test
		
		public void test1() {
			
			if(Assert.assertEquals(str2, str1)) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
		}
		
		
		
	}*/


