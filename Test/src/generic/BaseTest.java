package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst
{ 
	//public static WebDriver driver;
	public  WebDriver driver;
	
//	@Parameters("browser")
//	@BeforeClass
	@BeforeMethod
	public void OpenApplication()
	{ 
//		if(browser.equalsIgnoreCase("Chrome"))
//		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		 driver= new ChromeDriver();
  	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://login.naukri.com/nLogin/Login.php");
		// driver.manage().window().maximize();
		
	//	}
//		 if(browser.equalsIgnoreCase("firefox"))
//		{
//		System.setProperty(GECKO_KEY, GECKO_VALUE);
//		driver= new FirefoxDriver();
//		}
//		 
//		if(browser.equalsIgnoreCase("IE"))
//			{
//			System.setProperty(IED_KEY, IED_VALUE);
//			driver= new InternetExplorerDriver();
//			}
		  
	}	
	
	@AfterMethod
	//@AfterClass
	public void CloseApplication(ITestResult result)
	{
		String testName=result.getName();
		int status = result.getStatus();
		if(status==ITestResult.FAILURE)
		{
		Liberary.getSnapShot(driver, SNAP_PATH+testName);	
	}
		driver.quit();
	}
	
}
