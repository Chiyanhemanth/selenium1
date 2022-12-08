package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readexcel 
{
	
public static String getdata(String sheet,  int row, int cell) throws EncryptedDocumentException, IOException 
	
	{

		
		FileInputStream fls=new FileInputStream("./testdata/excel.xlsx");
		
		Workbook book = WorkbookFactory.create(fls);
			
		Cell cl = book.getSheet(sheet).getRow(row).getCell(cell);
		
		String value = cl.getStringCellValue();
		
		return value;
	}

}
