package week4.day1.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenTapsCreateLead extends TestngAnnotations {
	
	@DataProvider(name = "excelData")
	public Object[][] excelData() throws IOException {
		return readExcel("Createlead");
	}

	@Test(dataProvider = "excelData", threadPoolSize = 2, description = "Creates two different leads")
	public void createLead(String CompanyName, String firstname, String Lastname, String emailid, String phonenumber)
			throws IOException {
       
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		enterTextbyID("createLeadForm_companyName", CompanyName);
		enterTextbyID("createLeadForm_firstName", firstname);
		enterTextbyID("createLeadForm_lastName", Lastname);
		System.out.println("CompanyName:" + CompanyName + " and firstname:" + firstname + " and Lastname:" + Lastname);
		dropdownSelectByIdByIndex("createLeadForm_dataSourceId", 1);
		dropdownSelectByIdByValue("createLeadForm_marketingCampaignId", "CATRQ_CARNDRIVER");
		enterTextbyID("createLeadForm_primaryEmail", emailid);
		enterTextbyID("createLeadForm_primaryPhoneNumber", phonenumber);
		clickByClass("smallSubmit");
		String str1 = getTextById("viewLead_companyName_sp");
		
		String[] leadid = {str1.substring(str1.indexOf("(") +1,str1.indexOf(")"))};
		
		for(int i=0;i<leadid.length;i++){
		System.out.println("The lead id is:" +leadid[i]);
		}
		
		
	}
}

	

	