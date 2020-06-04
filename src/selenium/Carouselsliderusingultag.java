package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Carouselsliderusingultag
{

	public static void main(String[] args) 
	{
		// Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
	    ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//launch site
		driver.get("https://in.ebay.com/");
		//System.out.print(driver.findElements(By.cssSelector("transform")).size());
		//Test case-1:Locate carousel slider 
		WebElement slider=driver.findElement(By.className("carousel__list"));
		//Test case-2:Collect all slides in that slider and display total no of slides
		List<WebElement> slides=slider.findElements(By.xpath("child::li"));
		System.out.println("Total no of slides in carousel slider is :"+slides.size());
		//Test case-3:Check whether the slider is 2D or 3D by using transform property
		String x=slider.getCssValue("transform");
		System.out.println(x);
		if(x.startsWith("matrix3d"))
		{
			System.out.println("Slider is 3D");
		}
		else
		{
			System.out.println("Slider is 2D");
			//Start testing
			//Test Case-4:Check slide direction
			String y =x.substring(7, x.length()-1);//to remove "matrix(" and ")"
			System.out.println(y);
			String z[]=y.split(",");//split remaining value into pieces using ","
			z[4]=z[4].trim();//remove spaces from 5th piece(xoffset)
			z[5]=z[5].trim();//remove spaces from 6th piece(yoffset)
			int xoffset=Integer.parseInt(z[4]);
			int yoffset=Integer.parseInt(z[5]);
			if(yoffset==0 && xoffset>0) //xoffset is +ve
			{
				System.out.println("Left to right moving slides");
			}
			else if(yoffset==0 && xoffset<0) //xoffset is -ve
			{
				System.out.println("Right to left moving slides");
			}
			else if(xoffset==0 && yoffset>0) //yoffset is +ve
			{
				System.out.println("Top to bottom moving slides");
			}
			else
			{
				System.out.println("Bottom to top moving slides");
			}
			
			//Test case-5:Check time delay between slides in carousel slider
			String t=slider.getCssValue("transition");
			System.out.println(t);
			String d[]=t.split(" ");
			System.out.println("Delay between slides is :"+d[7]);
			System.out.println("Duration of each slide is :"+d[1]);                                                                     
			if(d[2].equals("ease-in"))
			{
				System.out.println("Slide starts slowly");
			}
			else if(d[2].equals("ease-out"))
			{
				System.out.println("Slide ends slowly");
			}
			else//ease-in-out
			{
				System.out.println("Slide starts slowly and ends slowly");
			}
			
		}
		//close site
		//driver.close();
	}

}
