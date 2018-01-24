package generic;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class No_Of_Row_In_ExcelSheet 
{
	
public static int getRowCount(String path,String sheet)
{
	int rc=0;
	try{
	   Workbook wb = WorkbookFactory.create( new File(path));
	   rc=wb.getSheet(sheet).getLastRowNum();
	   }
	   catch(Exception e)
	   {
      	
	   }
	 return rc;
}
}
