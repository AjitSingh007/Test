package script;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BrowseJobsByCompany;
import pom.CompanyToApply;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class Jobs extends BaseTest
{ 
	
    @Test(priority=6)
	public void JobTab() throws InterruptedException
      {
    	{
    		
    	String un = Excel.getCellValue(INPUT_PATH1,"Login1",2,0);
		 String pw = Excel.getCellValue(INPUT_PATH1,"Login1",2,1);
	
		 
		//Enter valid user name
		NakuriLooginPage I = new NakuriLooginPage(driver);
		I.setUserName(un);
	
		//Enter the password
		I.setPassword(pw);
	
		//click on LogIn Button
		I.clickLogin();
		
		Mynakuripage m = new Mynakuripage (driver);
		
		//click on job tab
		m.jobTab1();
		
		BrowseJobsByCompany b= new BrowseJobsByCompany(driver);
		//close the previous browser
		b.close1();
		Thread.sleep(2000);
		
		//pass the value for skill and location field
		b.skill("Selenium","Bangalore");
		
		// select the company
		b.SelectCompany();
		b.close1();
		
		CompanyToApply c = new CompanyToApply(driver);
		Thread.sleep(2000);
		
		//click on apply buton
		String p=c.apply();
		
		System.out.println(p.toString());
		
		//Get the sucess messgae
		Reporter.log(p,true);
		System.out.println("Test case for Apply is passed");
    		}
		 
    	}
    	
      
	
}
