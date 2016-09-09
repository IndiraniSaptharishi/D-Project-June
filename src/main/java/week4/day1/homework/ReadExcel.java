package week4.day1.homework;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

import wrappermethods.WrapperClass;

public class ReadExcel extends WrapperClass {
	
	

	@Test
	public void loginDetails() throws IOException {
		FileInputStream file = new FileInputStream("./data/login details.xls");
		HSSFWorkbook wbook = new HSSFWorkbook(file);
		// get the sheet
		HSSFSheet sheet = wbook.getSheetAt(0);
		// get the row
		int rowcount = sheet.getLastRowNum();
		int colcount=sheet.getRow(rowcount).getLastCellNum();
		for (int i = 1; i <=rowcount; i++) {
			
			HSSFRow row = sheet.getRow(i);
	
			for (int j = 0; j <colcount; j++) {
			
				HSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}

}
