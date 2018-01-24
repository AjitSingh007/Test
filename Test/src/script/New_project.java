package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;
import pom.ProjectUpdat;

public class New_project extends BaseTest
{
    @Test(priority=8)
	public void EnterNewProject() throws InterruptedException
	{
		String un = Excel.getCellValue(INPUT_PATH1,"Login1" , 2,0);
		String pw = Excel.getCellValue(INPUT_PATH1,"Login1" , 2,1);
	
		//Open Login page and Enter Username and Password
		
		NakuriLooginPage v = new NakuriLooginPage(driver);
		 v.setUserName(un);
		 v.setPassword(pw);
		 v.clickLogin();
		 
		// update new project on Naukri
		 //click on nakuri Button
		 Mynakuripage m = new Mynakuripage(driver);
		 m.clickOnProject();
		 
		 ProjectUpdat p = new ProjectUpdat(driver);
		
		 //Enter the Project NAme
		 p.client("SAP Clients");
		 
		 //Enter the Client name
		 p.Title("SAP MM");
		 
		 //Enter the date of joining to now
		 
	    p.SelectMonth();
	    
	    //Enter the Location
	    p.Laocation("bangalore");
	    
	    //Enter project details
	    p.Details("Material Management handles the procurement to payment process, from inventory through final invoice receipt and verification,This project deals with various kind of operation related to SAP");
	    
	    //Project rule
	    p.Role("Create script, excute, mantain,rasieBug ");
	    
	    //Select team
	    p.Team();
	    
	    //Enter skill
	    p.Skillused("Java,Selenium,JDBC");
	    
	    Thread.sleep(3000);
	    //Save the changes
	    p.SaveChange();
		 
		 
		
	}
}
