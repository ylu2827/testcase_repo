package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VirtruAssert {
	
	private String myUsername = "yangautomationtesting";
	private String myPassword = "Testing123!";
	private String inbox = "Inbox";
	private String sentMail = "Sent Mail";
	private String emailTitle = "Virtru Test";
	private String myEmailAddress = "yangautomationtesting@gmail.com";
	
	public void getURL(WebDriver driver) throws InterruptedException
	{
		// opens gmail URL
		driver.get("https://www.gmail.com");
		
		// maximizes the browser
		driver.manage().window().maximize();
		
		System.out.println("Gmail website found");
		
	}
	
	public void enterUsername(WebDriver driver) throws InterruptedException
	{
		// enters email address
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		if (we==null) {
			System.out.println("element is null");
		} else {
			System.out.println(we.toString());
			we.sendKeys(myUsername);
		}
		
				
		// clicks Next button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		System.out.println("Username entered");
	}
	
	public void enterPassword(WebDriver driver) throws InterruptedException
	{
		// enters password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(myPassword);
				
		// clicks Next button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
				
		System.out.println("Password entered");
	}
	
	public void clickSentMail(WebDriver driver) throws InterruptedException
	{
		// clicks Sent Mail
		Thread.sleep(4000);
		
		List<WebElement> navigationMenu = driver.findElements(By.cssSelector("a[class='J-Ke n0']"));
		
		for(int i = 0; i < navigationMenu.size(); i++)
		{
			System.out.println(navigationMenu.get(i).getText());
			if (navigationMenu.get(i).getText().contains(sentMail))
			{
				navigationMenu.get(i).click();
				System.out.println("Sent Mail button clicked");
				break;
			}
		}
		
	}
	
	public void clickEmail(WebDriver driver) throws InterruptedException
	{
		// clicks received Email
		Thread.sleep(1000);
		
		List<WebElement> emailMenu = driver.findElements(By.cssSelector("span[class='bog']"));
		System.out.println(emailMenu.size());
		
		for(int i = 0; i < emailMenu.size(); i++)
		{
			System.out.println(emailMenu.get(i).getText());
			if (emailMenu.get(i).getText().contains(emailTitle))
			{
				emailMenu.get(i).click();
				System.out.println("Received Email clicked");
				break;
			}
		}
		
		
	}
	
	public void assertContent(WebDriver driver) throws InterruptedException
	{
		// clicks Unlock Message button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\":96\"]/div[1]/div[1]/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/a")).click();
		
		// selects email
		Thread.sleep(8000);

		//JavascriptExecutor executor= (JavascriptExecutor) driver;
	    //executor.executeScript("document.querySelectorAll('div[aria-hidden=\"false\"]'");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/a[2]/div/span")).click();
		
		/*
		for(int i = 0; i < emailMenu.size(); i++)
		{
			System.out.println(emailMenu.get(i).getText());
			if (emailMenu.get(i).getText().contains(myEmailAddress))
			{
				emailMenu.get(i).click();
				System.out.println("My Email selected on Virtru page");
				break;
			}
		}*/
		
	}

}
