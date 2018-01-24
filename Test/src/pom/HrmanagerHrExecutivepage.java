package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HrmanagerHrExecutivepage extends BasePage
{
  
	//Enter the 
	@FindBy(className="sugInp")
	private  WebElement Search;
	
	@FindBy(className="blueBtn")
	private  WebElement Searchclcick;
	
	public HrmanagerHrExecutivepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);	
    }
	
	public void close1()
	{
		driver.close();
	}
	public void searchelement(String s)
	{  
		//psdbComponent.clickDocumentLink();
		
		
		//to transfer the control to the next tab
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
		Search.sendKeys(s);	
		Searchclcick.click();
	}
	}
