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

public class OpenTapsEditLead extends TestngAnnotations {

	@DataProvider(name = "excelData")
	public Object[][] excelData() throws IOException {
		return readExcel("Editlead");
	}

	@Test(dataProvider = "excelData", dependsOnMethods = "week4.day1.homework.OpenTapsCreateLead.createLead", description = "Edits the lead created")

	public void editLead(String firstname) throws InterruptedException {

		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		enterTextByXpath("(//input[@name='firstName'])[3]", firstname);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[4]");
		getTitle();
		String txt1 = getTextbyXpath("//span[@id='viewLead_dataSources_sp']");
		System.out.println("The Updated source is " + txt1);
		String txt2 = getTextbyXpath("//span[@id='viewLead_marketingCampaigns_sp']");
		System.out.println("The Updated Marketing campaign " + txt2);
		clickByLinkText("Edit");
		dropdownSelectByIdByVisibletext("addDataSourceForm_dataSourceId", "Employee");
		clickByXpath("(//input[@type='submit'])[2]");
		dropdownSelectByIdByIndex("addMarketingCampaignForm_marketingCampaignId", 2);
		clickByXpath("(//a[@class='buttontext'])[1]");
		clickByXpath("(//input[@type='submit'])[3]");
		clickByXpath("//input[@name='submitButton']");
		String txt3 = getTextbyXpath("//span[@id='viewLead_dataSources_sp']");
		System.out.println("The Updated source is " + txt3);
		String txt4 = getTextbyXpath("//span[@id='viewLead_marketingCampaigns_sp']");
		System.out.println("The Updated Marketing campaign " + txt4);
	}

}
