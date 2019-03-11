package total_qa.AllureReportDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class App 
{
	
	WebDriver driver;
	private static String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	@Test
	public void verifyHomePageTitle() throws IOException
	{
		
		System.setProperty(CHROME_DRIVER_PROPERTY, "C:\\SeleniumBrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
 
		driver.get("http://total-qa.com");
 
		String actual = driver.getTitle();
 
		String expected = "Total-QA - Future of Software Testing";
 
		Assert.assertEquals(actual,expected);
		
		
		driver.close();
	}
	

}
