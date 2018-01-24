package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ProjectUpdat extends BasePage
{


@FindBy(id="client")
private WebElement client;

@FindBy(id="project")
private WebElement ProjectTitle;

@FindBy(id="startMonth")
private WebElement Date;

@FindBy(xpath="//select[@id='startMonth']/option[7]")
private WebElement month;

@FindBy(id="startYear")
private WebElement startyear;

@FindBy(xpath="//select[@id='startYear']/option[4]")
private WebElement selectyear;

@FindBy(id="endYear")
private WebElement endYear;

@FindBy(xpath="//select[@id='endYear']/option[2]")
private WebElement PresentDate;
	
@FindBy(name="location")
private WebElement Location; 

@FindBy(id="details")
private WebElement details;

@FindBy(id="designationId")
private WebElement Role;

@FindBy(xpath="//option[contains(.,'Test Engineer')]")
private WebElement SelectRole;

@FindBy(id="role")
private WebElement Description;

@FindBy(id="teamSize")
private WebElement TeamSize;

@FindBy(xpath="//select[@id='teamSize']/option[10]")
private WebElement Selectsize;

@FindBy(id="Sug_skills")
private WebElement Skillused;

@FindBy(xpath="//form [@id='editForm']/div[11]/div/button")
private WebElement ClickSaveChanges;




	
	public ProjectUpdat(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void client(String Client)
	{
		client.sendKeys(Client);	
	}
	public void Title(String title)
	{
		ProjectTitle.sendKeys(title);
	}
	public void SelectMonth()
	{
		Date.click();
		month.click();
		startyear.click();
		selectyear.click();
		endYear.click();
		PresentDate.click();
	}
	public void Laocation(String Loaction)
	{
		Location.sendKeys(Loaction);
	}

	public void Details(String Details)
	{
		details.sendKeys(Details);	
	}
	
	public void Role(String role)
	{
		Role.click();
		SelectRole.click();
		Description.sendKeys(role);
		
		
	}
	
	public void Team()
	{
		TeamSize.click();
		Selectsize.click();
	}
	
	public void Skillused(String skill)
	{
		Skillused.sendKeys(skill);
	}
	
	public void SaveChange()
	{
		 ClickSaveChanges.click();	
	}
	
}

