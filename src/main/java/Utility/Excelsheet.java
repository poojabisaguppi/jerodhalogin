package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static String getsheetdata(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\pooja testing class notes\\SELENIUM Automation\\test.xlsx");
		String user = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return user;
	}

}
