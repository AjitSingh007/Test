package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class RadioButtonAndCheckbox extends BaseTest
{
@Test
    public void RadioAndCheakbox() throws InterruptedException
      {
	Excel ex = new Excel();
	String un=ex.getCellValue(INPUT_PATH1,"Login1",2,0);
	String pw=ex.getCellValue(INPUT_PATH1,"Login1",2,1);
	
	 NakuriLooginPage n = new NakuriLooginPage(driver);
	 n.setUserName(un);
	 n.setPassword(pw);
	 n.clickLogin();
	 
	 Mynakuripage b = new Mynakuripage(driver);
	 String lang="German";
	 b.RadioandCheck(lang);
	 
      }
	
}
