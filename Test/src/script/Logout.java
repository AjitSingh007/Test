package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class Logout extends BaseTest 
{
@Test
       public void Logout() throws InterruptedException
     {
	 String un = Excel.getCellValue(INPUT_PATH1,"Login1",1,0);
		// String	 un = Excel.getCellValue(INPUT_PATH2,"Sheet1",1,21);
     String pw = Excel.getCellValue(INPUT_PATH1,"Login1",1,1);
  
      //Enter valid user name
		NakuriLooginPage I = new NakuriLooginPage(driver);
		I.setUserName(un);
	
		//Enter the password
		I.setPassword(pw);
	
		//click on LogIn Button
		I.clickLogin();
		
		Mynakuripage v = new Mynakuripage(driver);
		v.LogOut();
		
	
     }
	

}
