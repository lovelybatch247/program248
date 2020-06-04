package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.gmail.com");
		//For visible element
		
		
		WebElement e1=driver.findElement(By.name("identifier"));
		int w1=e1.getSize().getWidth();
		int h1=e1.getSize().getHeight();
		System.out.println(w1+" "+h1);
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		System.out.println(x1+" "+y1);
		int w11=e1.getRect().getWidth();
		int h11=e1.getRect().getHeight();
		int x11=e1.getRect().getX();
		int y11=e1.getRect().getY();
		System.out.println(w11+" "+h11+" "+x11+" "+y11);
		
		//For Hidden element
		
		
		WebElement e2=driver.findElement(By.name("hiddenPassword"));
		int w2=e2.getSize().getWidth();
		int h2=e2.getSize().getHeight();
		System.out.println(w2+" "+h2);
		int x2=e2.getLocation().getX();
		int y2=e2.getLocation().getY();
		System.out.println(x2+" "+y2);
		int w22=e2.getRect().getWidth();
		int h22=e2.getRect().getHeight();
		int x22=e2.getRect().getX();
		int y22=e2.getRect().getY();
		System.out.println(w22+" "+h22+" "+x22+" "+y22);

		
	}

}
