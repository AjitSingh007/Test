package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Ptm extends BasePage
{

	@FindBy(id="input_1")
	private  WebElement Code;
	@FindBy(id="input_2")
	private  WebElement disc;
	@FindBy(xpath="//div[@class='box1']/button[1]")
	private  WebElement submit1;
	
	@FindBy(id="input_0")
	private  WebElement UserName;
	
	@FindBy(id="input_1")
	private  WebElement Password;
	
	@FindBy(id="loginForm")
	private  WebElement Submit2;
	
	@FindBy(linkText="Log In/Sign Up")
	private WebElement log; 
	
	public Ptm(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void Test(String s,String p) throws InterruptedException
	{
		Code.sendKeys(s);
		disc.sendKeys(p);
		Thread.sleep(3000);
		submit1.click();
	}
	
	public void Login(String u,String P1) throws InterruptedException
	{   //UserName.clear();
	    Thread.sleep(2000);
		UserName.sendKeys(u);
		//Password.clear();
		Thread.sleep(2000);
		Password.sendKeys(P1);
		//Thread.sleep(20000);
		//Submit2.click();
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs2.get(0));
//	    Thread.sleep(1000);
		
	}
	
	public void log1()
	{
		log.click();
	}

	
	
}
