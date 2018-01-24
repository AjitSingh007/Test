package generic;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
public static  String getCellValue(String path,String Sheet,int row,int cell)
{

	String v ="";
	try
	{
       Workbook wb = WorkbookFactory.create(new File(path));
       Cell c= wb.getSheet(Sheet).getRow(row).getCell(cell);
       v=c.toString();
	}
	catch(Exception e)
	{
		
	}
	return v;	
}
}
