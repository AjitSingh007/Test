package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class CompanyToApply extends BasePage 
{
  @FindBy(id="trig1")
  private WebElement apply;
  
  @FindBy(id="qupSubmit")
  private WebElement UpdateandApply;
  
  @FindBy(className="cnt")
  private WebElement getsucessmsg;
  
  
	public CompanyToApply(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
		
	}
	
	public String apply() throws InterruptedException
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    Thread.sleep(2000);
		apply.click();
		UpdateandApply.click();
		String s= getsucessmsg.getText();
		return s;
		
	}
	

}
