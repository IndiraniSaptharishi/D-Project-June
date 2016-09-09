package week4.day1.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExampleWithExcel extends TestngAnnotations {
	
	
	String[] leadid;
	

	@DataProvider(name = "DP1")
	public Object[][] excelData1() throws IOException {
		return readExcel("Createlead");
	}
	
    
	@Test(dataProvider="DP1",threadPoolSize=2,description="Creates two different leads")
	public void createLead(String CompanyName,String firstname,String Lastname,String emailid) {
		
		
		clickByLinkText("Leads");
        clickByLinkText("Create Lead");
		enterTextbyID("createLeadForm_companyName", CompanyName);
		enterTextbyID("createLeadForm_firstName", firstname);
		enterTextbyID("createLeadForm_lastName", Lastname);
		System.out.println("CompanyName:" +CompanyName+" and firstname:" +firstname+" and Lastname:" +Lastname);
		dropdownSelectByIdByIndex("createLeadForm_dataSourceId", 1);
		dropdownSelectByIdByValue("createLeadForm_marketingCampaignId", "CATRQ_CARNDRIVER");
		enterTextbyID("createLeadForm_primaryEmail", emailid);
		//enterTextbyID("createLeadForm_primaryPhoneNumber", phonenumber);
		clickByClass("smallSubmit");
		String str1=getTextById("viewLead_companyName_sp");
		int strlength=str1.length();
		String leadid=str1.substring(strlength-6,strlength-1);
		System.out.println("The lead id is:" +leadid);
		
	}
	@DataProvider(name = "DP2")
	public Object[][] excelData2() throws IOException {
		return readExcel("Editlead");
	}
	

    @Test(dataProvider="DP2",dependsOnMethods="createLead",description="Edits the lead created")
	public void editLead(String firstname) throws InterruptedException{
    	
		
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		enterTextByXpath("(//input[@name='firstName'])[3]", firstname);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[4]");
		getTitle();
		clickByLinkText("Edit");
		dropdownSelectByIdByVisibletext("addDataSourceForm_dataSourceId", "Employee");
		clickByXpath("(//input[@type='submit'])[2]");
		dropdownSelectByIdByIndex("addMarketingCampaignForm_marketingCampaignId", 2);
		clickByXpath("(//a[@class='buttontext'])[1]");
		clickByXpath("(//input[@type='submit'])[3]");
		clickByXpath("//input[@name='submitButton']");
		String txt1=getTextbyXpath("//span[@id='viewLead_dataSources_sp']");
		System.out.println("The Updated source is" +txt1);
		String txt2=getTextbyXpath("//span[@id='viewLead_marketingCampaigns_sp']");
		System.out.println("The Updated Marketing campaign" +txt2);
		
	}
  
    @DataProvider(name = "DP3")
	public Object[][] excelData3() throws IOException {
		return readExcel("Mergelead");
	}

    @Test(dataProvider="DP3",dependsOnMethods="editLead",description="Merges the two leads")
	public void mergeLead(String firstname) throws InterruptedException{
    	
    	clickByLinkText("Leads");
		clickByLinkText("Merge Leads");
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[1]");
		switchtolastwindow();
		enterTextByXpath("//input[@name='id']", leadid[0]);
		clickByXpath("//button[@class='x-btn-text'][1]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[1]");
		switchToParentwindow();
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[2]");
		switchtolastwindow();
		enterTextByXpath("//input[@name='id']", leadid[1]);
		clickByXpath("//button[@class='x-btn-text'][1]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[1]");
		switchToParentwindow();
		clickByXpath("//a[@class='buttonDangerous']");
		Thread.sleep(3000);
		switchToAlert("accept");
		
	
	}
}



