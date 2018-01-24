package script;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class HomePage extends BaseTest
{
	@Test(priority=2)
	public void GetRecuiterNoMsg() 
	{
		 String un = Excel.getCellValue(INPUT_PATH1,"Login1",1,0);
		 String pw = Excel.getCellValue(INPUT_PATH1,"Login1",1,1);
	
		 
		//Enter valid user name
		NakuriLooginPage I = new NakuriLooginPage(driver);
		
	//	GetTitle and verify it by creating method in the same place.
	//----------------------------------------------------------------------	
		String atitle = driver.getTitle();
		System.out.println("ttitle of Login Page: "+atitle);
		String etitle="Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com";
		Assert.assertEquals(atitle,etitle);
		System.out.println("done");
		
		
	//-----------------------------------------------------------------------------
		//Now Extending the method
		BasePage bp = new BasePage(driver);
		bp.VerifyTitle("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
		System.out.println("Yes done from Extends");
		
		
		//Enter username
		I.setUserName(un);
	
		//Enter the password
		I.setPassword(pw);
	
		//click on LogIn Button
		I.clickLogin();
		 
		Mynakuripage I1 = new Mynakuripage(driver);
		String atitle1 = driver.getTitle();
		System.out.println("ttitle of HomePage: "+atitle1);
		
	
		
//		I1.searchelement("Selenium");
		
//Select Recquiter button		
	I1.recquiterButton();
		
		try
		{
			I1.Recuiter();	
		}
		catch(Exception e)
		{
			Reporter.log("no Value",true);
		}
		
		
	}
	
	

}
