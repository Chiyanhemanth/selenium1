package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass implements constant

{
	
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void openapp()
	{
		System.setProperty(gecko_key, gecko_value);
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	
		public void closeapp(ITestResult results) throws IOException
		{
		
		if(ITestResult.FAILURE==results.getStatus())
		{
			screenshot.getphoto(driver);
			
		}
		driver.close();
		
		}
	
	

}
