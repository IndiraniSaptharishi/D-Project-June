package week4.day1.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenTapsDeleteLead extends TestngAnnotations{
	public Object[][] readExcel(String fileName) throws IOException {

		// Read the file
		FileInputStream fis = new FileInputStream(new File("./data/" + fileName + ".xls"));
		HSSFWorkbook wbook = new HSSFWorkbook(fis);

		// go to first sheet
		HSSFSheet sheet = wbook.getSheetAt(0);

		// get the row count
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {

			// go to the row
			HSSFRow row1 = sheet.getRow(i);

			for (int j = 0; j < colCount; j++) {

				// go to the cell 1
				HSSFCell cell1 = row1.getCell(j);
				// print the content of the cell
				// System.out.println(cell1.getStringCellValue());
				obj[i - 1][j] = cell1.getStringCellValue();
			}

		}
		return obj;

	}

	@DataProvider(name = "excelData")
	public Object[][] excelData() throws IOException {
		return readExcel("Deletelead");
	}
	@Test(dataProvider = "excelData", description = "Delete the lead")
	public void DeleteLead(String phonenumber) throws InterruptedException{
		
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByXpath("//span[contains(text(),'Phone')]");
		enterTextByXpath("//input[@name='phoneNumber']", phonenumber);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		clickByXpath("(//a[@class='linktext'])[4]");
		clickByLinkText("Delete");
		
	}

}
