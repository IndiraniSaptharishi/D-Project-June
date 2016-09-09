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

public class OpenTapsMergeLead extends TestngAnnotations {

	@DataProvider(name = "excelData")
	public Object[][] excelData() throws IOException {
		return readExcel("Mergelead");
	}

	// @Test(dataProvider = "excelData", dependsOnMethods =
	// "week4.day1.homework.OpenTapsEditLead.editLead", description = "Merges
	// the two leads")
	@Test(dataProvider = "excelData", description = "Merges the two leads")
	public void mergeLead(String firstname1, String firstname2) throws InterruptedException {

		clickByLinkText("Leads");
		clickByLinkText("Merge Leads");
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[1]");
		switchtolastwindow();
		enterTextByXpath("//input[@name='firstName']", firstname1);
		clickByXpath("//button[@class='x-btn-text'][1]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[1]");
		switchToParentwindow();
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[2]");
		switchtolastwindow();
		enterTextByXpath("//input[@name='firstName']", firstname2);
		clickByXpath("//button[@class='x-btn-text'][1]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[1]");
		switchToParentwindow();
		clickByXpath("//a[@class='buttonDangerous']");
		Thread.sleep(3000);
		switchToAlert("accept");
		clickByLinkText("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterTextByXpath("//input[@name='emailAddress']", "indhusan.12@gmail.com");
		clickByXpath("//button[@class='x-btn-text'][1]");
		if (!clickByLinkText(firstname1)) {
			System.out.println("Leads Merged");
		} else {
			System.out.println("Merge doesn't happen");
		}
	}

}
