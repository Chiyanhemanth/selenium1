package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	public static void getphoto(WebDriver driver) throws IOException
	{
		String photo="./photos/";
		
		 Date d = new Date();
		 
		 String d1=d.toString().replaceAll(":", "-");
		 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dst = new File(photo+d1+".jpeg");
		
		//FileUtils.copyFile(src, dst);
		
		FileHandler.copy(src, dst);	
		
	
	
		
			 
		
	}

}
