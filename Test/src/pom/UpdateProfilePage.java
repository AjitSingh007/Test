package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class UpdateProfilePage extends BasePage 
{
	@FindBy(xpath="//div/button")
	private WebElement SaveChanges; 

	public UpdateProfilePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	 public void Save()
	 {
		 
		 SaveChanges.click(); 
	 }
	
}
