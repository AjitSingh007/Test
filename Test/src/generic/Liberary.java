package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Liberary 
{

	public static void getSnapShot( WebDriver driver,String Folder)
	{
	
		Date d = new Date();
		String now = d.toString().replace(':','-');
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		File destFile = new File(Folder+now+".png");
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e)
		{
			
		}
	}
}
