package week2.homework;

import org.junit.Test;

import wrappermethods.WrapperClass;

public class Testcase2 extends WrapperClass {
	@Test
	public void EditLead() throws InterruptedException{
		launchApp("http://demo1.opentaps.org/opentaps/control/main", "Firefox");
		enterTextbyID("username", "DemoSalesManager");
		enterTextbyID("password", "crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		enterTextByXpath("(//input[@name='firstName'])[3]", "Indirani");
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
		String Sourceafteredit=getTextbyXpath("//span[@id='viewLead_dataSources_sp']");
		System.out.println("The Updated source is" +Sourceafteredit);
		String MarketingafterEdit=getTextbyXpath("//span[@id='viewLead_marketingCampaigns_sp']");
		System.out.println("The Updated Marketing campaign" +MarketingafterEdit);
		
	}

}
