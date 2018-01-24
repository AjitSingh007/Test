package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class TotalViews extends BaseTest
{
	@Test(priority=5)
public void views1() throws InterruptedException
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
		 
		Mynakuripage m = new Mynakuripage(driver);
		m.getviews();
		
		
		
}
	
}
