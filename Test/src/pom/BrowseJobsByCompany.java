package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class BrowseJobsByCompany extends BasePage
{
	@FindBy(xpath="//div[@class='inpWrap']/input[@class='sugInp' and @maxlength='250']")
	private WebElement skill;
	
	@FindBy(xpath="//input[@placeholder='Location']")
	private WebElement location;
	
	@FindBy(xpath="//input[@placeholder='Experience']")
	private WebElement experience;
	
	@FindBy(xpath="//div[@class='qsbfield']/div[3]/div[2]//div/ul/li[4]")
	private WebElement experience1;
	
	@FindBy(xpath="//input[@placeholder='Salary']")
	private WebElement salary;
	@FindBy(xpath="//div[@id='salary_dd']/div[2]//div/ul/li[6]")
	private WebElement salary1;
	
	@FindBy(id="qsbFormBtn")
	private WebElement search;
	
	@FindBy(xpath="//div[@class='mainSec']/div/div[2]/div/div[3]/a/ul/li")
	 private WebElement comany1;

	public BrowseJobsByCompany(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	
	}
	public void close1()
	{
		driver.close();
	}
	
	
	public void skill( String s,String t) throws InterruptedException
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    Thread.sleep(2000);
	    
	    //Enter your skill ex. seleinum
		skill.sendKeys(s);
		
		//Enter your prefered location 
	//	location.sendKeys(t);
		 Thread.sleep(2000);
		
		 //Select Experience option
		experience.click();
		
		//Select year of experience 
		Thread.sleep(2000);
		experience1.click();
		
		// Select salary option 
		 Thread.sleep(2000);
		salary.click();
		
		// Select salary in Lakh
		Thread.sleep(2000);
		salary1.click();
		
		// click on search button
		 Thread.sleep(2000);
		search.click();
		
	}
	
	     public void SelectCompany()
	     {
	    	 //Select the company name in 1st position
	    	 comany1.click();
	    	 
	    
	     }
	
}

