package script;



import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.HrmanagerHrExecutivepage;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class SearchElements extends BaseTest
{

@Test(priority=3)
 public void Searchtopics() throws InterruptedException
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
	
	// create object Mynakuripage class
	Mynakuripage I1 = new Mynakuripage(driver);
	
	//Select Recquiter button	
    I1.recquiterButton();
	
    Thread.sleep(2000);
    
 // create object HrmanagerHrExecutivepage class
	HrmanagerHrExecutivepage h = new HrmanagerHrExecutivepage(driver);
	
	//close the current window
	h.close1();
	
	//Pass the element to be search to New window in HrmanagerHrExecutivepage
	h.searchelement("selenium");
	
	 
	
	
 }
	
}
