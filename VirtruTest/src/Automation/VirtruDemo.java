package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirtruDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\QA\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		VirtruAssert a = new VirtruAssert();
		a.getURL(driver);
		a.enterUsername(driver);
		a.enterPassword(driver);
		a.clickSentMail(driver);
		a.clickEmail(driver);
		a.assertContent(driver);

	}

}
