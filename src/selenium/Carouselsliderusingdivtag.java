package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Carouselsliderusingdivtag 
{

	public static void main(String[] args) 
	{
		//Open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.snapdeal.com/");
		//Locate carousel slider
		WebElement cs=driver.findElement(By.xpath("//div[@id='top-banner']"));
		if(cs.getTagName().equals("div")) 
		{
			System.out.println("Carousel slider developed using <div> tag has hidden slides also");
		}
		//Collect all slides in the carousel slider and display total no of slides
		List<WebElement> slides=cs.findElements(By.xpath("child::div"));
		System.out.println("Total no of slides :"+slides.size());
		//Display count of visible slides and hidden slides
		int visible=0;
		int hidden=0;
		for(WebElement slide:slides) 
		{
			if(slide.getAttribute("class").contains("clone")) 
			{
				hidden++;
			}
			else 
			{
				visible++;
			}
		}	
		System.out.println("Total no of visible slides :"+visible);
		System.out.println("Total no of hidden slides :"+hidden);
		//Verify type of carousel slider(2D or 3D)
		String x=cs.getCssValue("transform");
		System.out.println("Value of transform property is :"+x);
		if(x.startsWith("matrix3d"))
		{
			System.out.println("Slider is 3D");
		}
		else
		{
			System.out.println("Slider is 2D");
			//Start testing
			//Verify slider direction
			String y= x.substring(7,x.length()-1);//to remove "matrix(" and ")"
			//System.out.println(y);
			String z[]=y.split(",");//to split the remaining value based on ","
			z[4]=z[4].trim();//to remove unwanted space
			z[5]=z[5].trim();//to remove unwanted space
			int xoffset=Integer.parseInt(z[4]);
			int yoffset=Integer.parseInt(z[5]);
			if(xoffset>0 && yoffset==0)//xoffset is +ve
			{
				System.out.println("Slides are moving left to right");
			}
			else if(xoffset<0 && yoffset==0)//xoffset is -ve
			{
				System.out.println("Slides are moving right to left");
			}
			else if(xoffset==0 && yoffset>0) //yoffset is +ve
			{
				System.out.println("Slides are moving top to bottom");
			}
			else //yoffset is -ve
			{
				System.out.println("Slides are moving bottom to top");
			}
			//Time delay between two slides
			String t=cs.getCssValue("transition");
			System.out.println("Value of transition is :"+t);
			String d[]=t.split(" ");//split value using blank space
			System.out.println("Duration of each slide :"+d[1]);
			System.out.println("Delay between two slides :"+d[3]);
			if(d[2].equals("ease-in"))
			{
				System.out.println("Slides start slowly");
			}
			else if(d[2].equals("ease-out"))
			{
				System.out.println("Slides end slowly");
			}
			else//ease-in-out
			{
				System.out.println("Slides start slowly and end slowly");
			}
		}
	}
}
