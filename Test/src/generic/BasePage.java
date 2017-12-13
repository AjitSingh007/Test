package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
 
	public  WebDriver driver;

	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void VerifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		try
		{
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Pass:Title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("FAIL:Title is not matching", true);
			Assert.fail();
		}
		
		
	}
	public boolean verifyElementIsPresent(WebElement element)
	{
		
	WebDriverWait wait = new WebDriverWait(driver,5);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	}
}
