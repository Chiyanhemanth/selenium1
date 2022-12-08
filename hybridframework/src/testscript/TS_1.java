package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.POMscript;
import generic.baseclass;
import generic.readexcel;

public class TS_1 extends baseclass{
	
	@Test
	public void Script () throws EncryptedDocumentException, IOException
	{
		String un=readexcel.getdata("Sheet1", 0, 0);
		//String bun = un1.toString();
		
		String Pwd=readexcel.getdata("Sheet1", 0, 1);
		
		POMscript pmc=new POMscript(driver);
		pmc.email(un);
		pmc.pwd(Pwd);
		
		
		pmc.login();
		
	}
	
	

}
