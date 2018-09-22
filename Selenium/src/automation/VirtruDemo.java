package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class VirtruDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver40.exe");
		System.setProperty("webdriver.chrome.logfile", "c:\\apps\\chromedriver.log");
		System.setProperty("webdriver.chrome.verboseLogging", "true");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("–no-sandbox");
		options.addArguments("–disable-dev-shm-usage");
		options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        
        
		/*
	    
		VirtruAssert a = new VirtruAssert();
		a.getURL(driver);
		a.enterUsername(driver);
		a.enterPassword(driver);
		a.clickSentMail(driver);
		a.clickEmail(driver);
		a.assertContent(driver);
		
		*/
       
	}

}
