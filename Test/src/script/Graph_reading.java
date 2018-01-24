package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Mynakuripage;
import pom.NakuriLooginPage;

public class Graph_reading extends BaseTest {

	@Test
	public void graphtest() throws InterruptedException
	{
		 String un = Excel.getCellValue(INPUT_PATH1,"Login1",2,0);
		 String pw = Excel.getCellValue(INPUT_PATH1,"Login1",2,1);
	
		
		NakuriLooginPage n = new NakuriLooginPage(driver);
		  n.setUserName(un);
		  n.setPassword(pw);
		  n.clickLogin();
		  
		  Mynakuripage m = new Mynakuripage(driver);
		  m.graph();
		  
		  
				
	}

}
