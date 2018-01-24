package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;

public class Mynakuripage  extends BasePage
{
      
		@FindBy(id="blobId")
		private  WebElement notification;
		
		@FindBy(xpath="//div[.='Recruiters']")
		private  WebElement Rercuiters;
		
		@FindBy(xpath="//span[.='Recruiter Messages']")
		private  WebElement RecutersMsg;
		
		@FindBy(xpath="//li/a[6]")
		private  WebElement ITskils;
		
		@FindBy(xpath="//li[@class='bdrLN']/a")
		private  WebElement Viewes;
		
		@FindBy(xpath="//div[.='Jobs']")
		private  WebElement jobst;
		
		@FindBy(partialLinkText="Projects")
		private WebElement project;
		
		//tO GET THE profile Performance values.
		@FindBy(xpath="//div[.='Views']")
		private WebElement ProfilePerformance;
        //Get Profile value
		@FindBy(xpath="//div[.='Views']/../a")
	    private	WebElement pvalue;
		//GetDOwnload value
		@FindBy(xpath="//div[.='Downloads']/../a")
		private WebElement Download;
		//Get Contact Value
		@FindBy(xpath="//div[.='Contacts']/../a")
		private WebElement contact;
	
		//	Graph Value Reading
		@FindBy(xpath="//a[contains(.,'Sapient')]")
		private WebElement graph1;
		
		@FindBy(xpath="//a")
		private  List<WebElement> AllLinks;
		
		//LogOut From Homepage
		@FindBy(xpath="//div[.='My Naukri']")
		private WebElement MyNakuriButton;
		
		@FindBy(xpath="//a[.='Change Password']/../../li[5]/a")
		private WebElement LogoutButton;
		
		@FindBy(xpath=("//a[.='Login Again']/.."))
		private WebElement verify;
		
		
		//For Radio button and check Box in Nakuri MoreInfo Page
		@FindBy(xpath="//div[@id='leftNav_updateProfile']/ul/li/a[9]")
		private WebElement Radioandchaeck;
		
		@FindBy(className="w75bt")
		private WebElement Addmore;
		
		@FindBy(xpath="//tr[@id='lang3']/td/input[2]")
		private WebElement Language;
		
		@FindBy(xpath="//tr[@id='lang3']/td[2]/select")
		private WebElement proficiencyLevel;
		
		@FindBy(xpath="//tr[@id='lang3']/td[2]/select/option[4]")
		private WebElement Level;
		
		@FindBy(xpath="//tr[@id='lang3']/td[3]/input")
		private WebElement Checkbox1;
		
		@FindBy(xpath="//tr[@id='lang3']/td[4]/input")
		private WebElement Checkbox2;
		
		@FindBy(xpath="//tr[@id='lang3']/td[5]/input")
		private WebElement Checkbox3;
		
		@FindBy(id="day")
		private WebElement Radio1;
		
		
		
		
	
		
		
		
		
			
	public Mynakuripage(WebDriver driver)
	            {
		          super(driver);
		          PageFactory.initElements(driver, this);
	            }
	
	

	public void Recuiter() throws InterruptedException
	            {   
		
		        notification.click();
		        Thread.sleep(2000);
		        RecutersMsg.click();
		
	            }
	
	public void recquiterButton()
	            {
		           Rercuiters.click();
	            }
	
	public void Itskilltest()
	{
		//to transfer the control to the next tab
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(0));
		        ITskils.click();	
	}
	
	public void getviews()
	{
		System.out.println(Viewes);
		Viewes.click();
		//return Viewes;
	}
	
	public void jobTab1() throws InterruptedException
	{
		
		 jobst.click();
		//to transfer the control to the next tab
			
	}
	public void clickOnProject()
	{
		project.click();
	}
	
   public  void ProfilePerformancevalue()
      {
	WebElement  wb=  ProfilePerformance;
	String b = wb.getText();
	
	Reporter.log(b,true);
	//System.out.println(b);
	WebElement v1 = pvalue;
	String c =v1.getText();
	System.out.print("Profile view is: "+" ");
	Reporter.log(c,true);
	
	WebElement v2 = Download;
	String c1 =v2.getText();
	System.out.print("Download: "+" ");
	Reporter.log(c1,true);
	
	WebElement v3 = contact;
	String c2 =v3.getText();
	//String c3=v3.i
	System.out.print("Contact: "+" ");
	Reporter.log(c2,true);
	
	//Css Values 
	
	String s = pvalue.getCssValue("background-color");
	String s1 = pvalue.getCssValue("color");
	String s2 = pvalue.getCssValue("font-size");
	String s3 = pvalue.getCssValue("font-weight");
	String s4 = pvalue.getCssValue("line-height");
	System.out.println("Background color is:  " +s);
	System.out.println("color is:  " +s1);
	System.out.println("font size is:  " +s2);
	System.out.println("Font Waight is  " +s3);
	System.out.println("Line Height is  " +s4);
	
	  }
   public void graph()
   {
	 driver.switchTo().frame(0);
	   graph1.click();
   }
   
   public int GetAllLinksOnHomePage()
   {
	   
	   int count =AllLinks.size();
	   return count;
   }
   
   
   //LogOut From Nakuri page
     public void LogOut() throws InterruptedException
     {
    	 Actions act = new Actions(driver);
    	 act.moveToElement(MyNakuriButton).perform();
    	 
    	 Thread.sleep(100);
    	 LogoutButton.click();
    	 
    	 String atitle="You have successfully Logged out of naukri.com Login Again";
    	 String etitle=verify.getText();
    	 Assert.assertEquals(atitle, etitle);
    	 System.out.println("Title matched");
    	 }
    
     //Radio button and Chaeck box
     
     public void RadioandCheck(String lan) throws InterruptedException
      {
    	 Radioandchaeck.click(); 
    	 Addmore.click();
    	 
    	 Language.sendKeys(lan);
    	 
    	 proficiencyLevel.click();
    	 Level.click();
    	 
    	 Checkbox1.click();
    	 Checkbox2.click();
    	 Checkbox3.click();
    	 
    	 Radio1.click();
    	 Thread.sleep(3000);
    	 
      }

}
