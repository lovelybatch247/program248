import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotOnFailure implements TestRule{

    private WebDriver driver;

    public ScreenShotOnFailure(WebDriver driver, String browser){
        this.driver = driver;
        if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\LOVELY\\selenium20\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\LOVELY\\selenium20\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			EdgeOptions eo=new EdgeOptions();
			eo.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
			System.setProperty("webdriver.edge.driver","C:\\LOVELY\\selenium20\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver(eo);
		}/*else if(browser.equalsIgnoreCase("opera")){
			System.setProperty("webdriver.opera.driver","C:\\LOVELY\\selenium20\\operadriver_win64 (1)\\operadriver_win64");
			driver=new OperaDriver();
		}*/else {
		
			System.out.println(browser +" Browser open method not found,. exiting ...");
			System.exit(0);
		}
		
    }

    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                	System.out.println("driver value in evaluTe method "+driver);
                    statement.evaluate();
                } catch (Throwable t) {
                    // exception will be thrown only when a test fails.
                    captureScreenShot(frameworkMethod.getName());
                    // rethrow to allow the failure to be reported by JUnit
                    throw t;
                }
            }

            public void captureScreenShot(String fileName) throws IOException {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                fileName += UUID.randomUUID().toString();
                File targetFile = new File("C:\\LOVELY\\selenium20\\" + fileName + ".png");
                FileUtils.copyFile(scrFile, targetFile);
            }
        };
    }

	@Override
	public Statement apply(Statement arg0, Description arg1) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                	System.out.println("driver value in evaluTe method "+driver);
                    statement.evaluate();
                } catch (Throwable t) {
                    // exception will be thrown only when a test fails.
                    captureScreenShot(frameworkMethod.getName());
                    // rethrow to allow the failure to be reported by JUnit
                    throw t;
                }
            }

            public void captureScreenShot(String fileName) throws IOException {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                fileName += UUID.randomUUID().toString();
                File targetFile = new File("C:\\LOVELY\\selenium20\\" + fileName + ".png");
                FileUtils.copyFile(scrFile, targetFile);
            }
        };
	}

}
