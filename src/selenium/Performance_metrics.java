package selenium;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.performance.Performance;
import org.openqa.selenium.devtools.performance.model.Metric;

public class Performance_metrics {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Get and display performance metrics
		Command cmd1=Performance.enable();
		dt.send(cmd1);
		//Launch site
		driver.get("https://www.amazon.com");
		List<Metric> mc=dt.send(Performance.getMetrics());
		for(Metric m:mc)
		{
			System.out.println(m.getName()+"-->"+m.getValue());
		}
		//Command cmd2=Performance.getMetrics();
		//List<Metric> ms=(List<Metric>) dt.send(cmd2);
		
	}

}
