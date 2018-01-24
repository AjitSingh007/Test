package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import generic.BasePage;

public class NakuriLooginPage extends BasePage
{
	
	@FindBy(id="emailTxt")
	private  WebElement unTB;
	
	@FindBy(id="pwd1")
	private  WebElement pwTB;
	
	@FindBy(xpath =("//form/div[7]/input"))
	private  WebElement loginButton;
	
	@FindBy(id="srvErr")
	private  WebElement errorMessage;
	

	public NakuriLooginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginButton.click();
	}
	public void errorMsg()
	{
	   Assert.assertTrue(verifyElementIsPresent(errorMessage));
	}


	

}
