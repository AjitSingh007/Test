package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class ProfilePerformance extends BaseTest 
{
   @Test(priority=10)
	public void GetPerformancevalue()
	{
//		String un =Excel.getCellValue("INPUT_PATH1","Login1", 1,0);
//		String pw =Excel.getCellValue("INPUT_PATH1","Login1", 1,1);
	   
	    String un = Excel.getCellValue(INPUT_PATH1,"Login1",2,0);
		// String	 un = Excel.getCellValue(INPUT_PATH2,"Sheet1",1,21);
		 String pw = Excel.getCellValue(INPUT_PATH1,"Login1",2,1);
		
		NakuriLooginPage I = new NakuriLooginPage(driver);
		I.setUserName(un);
	
		//Enter the password
		I.setPassword(pw);
	
		//click on LogIn Button
		I.clickLogin();
		
		Mynakuripage m = new Mynakuripage(driver);
		m.ProfilePerformancevalue();
	}
	
}
