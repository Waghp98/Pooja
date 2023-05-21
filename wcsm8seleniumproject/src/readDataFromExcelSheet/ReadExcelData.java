package readDataFromExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	//read data from ipl excel sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");  //provide the path of excel file
		Workbook wh = WorkbookFactory.create(fis);  //make the file ready for read
		Sheet sheet = wh.getSheet("IPL");    //get into sheet
		Row row = sheet.getRow(3);           //get into desired row
		Cell cell = row.getCell(1);          //get into desired cell
		String data = cell.getStringCellValue();  //read the value from cell
		System.out.println(data);
		
	}
	

}
