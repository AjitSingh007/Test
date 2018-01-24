package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Ptm;

public class Promocode extends BaseTest 
{
    @Test
	public void Code() throws InterruptedException
	{   int count=0;
    	String s="RSH37AWMZUDB";
   	    String q="very good ";
    	Ptm p = new Ptm(driver);
     	p.Test(s, q);
    	Thread.sleep(3000);
    	count++;
    	//p.log1();
    	driver.switchTo().frame(0);
    	
    	String u ="8147016607";
    	String p1="Ajit@007";
    	p.Login(u, p1);
    	
    	Thread.sleep(30000);
    	
    	
    	while(count>0)
    	{  
    		
    		
    		for(int i=10677;i<20003;i++)
    		{
    		 driver.navigate().refresh(); 
    		 
    		 String un = Excel.getCellValue(INPUT_PATH1,"Login1",i,0);
    		// Thread.sleep(2000);
    		 q="very good ";
        	 Ptm p11 = new Ptm(driver);
          	 p11.Test(un, q);
         	//Thread.sleep(3000);
    		}
    		// un="RSH37AWMZUDB";
       	    	
    	}
    	
    	
    	
    	
	}
	
}
