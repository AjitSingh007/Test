package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;
import pom.UpdateProfilePage;

public class EditITskills extends BaseTest
{
     @Test(priority=4)
	public void itskillstestandedit()
	{
		
    	 String un = Excel.getCellValue(INPUT_PATH1,"Login1",1,0);
		 String pw = Excel.getCellValue(INPUT_PATH1,"Login1",1,1);
	
		 
		//Enter valid user name
		NakuriLooginPage I = new NakuriLooginPage(driver);
		I.setUserName(un);
	
		//Enter the password
		I.setPassword(pw);
	
		//click on LogIn Button
		I.clickLogin();
		
		Mynakuripage m= new Mynakuripage(driver);
		
		//Select ITskill option
		m.Itskilltest();
		
		UpdateProfilePage u = new UpdateProfilePage(driver);
		
		//click on save button
		 u.Save();
		
    	 
	}
	
}
