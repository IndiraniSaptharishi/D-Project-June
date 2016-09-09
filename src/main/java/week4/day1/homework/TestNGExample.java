package week4.day1.homework;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class TestNGExample extends TestngAnnotations{
	public String[] leadid= new String[2] ;
	
	int i=0;
	@DataProvider(name="getLeadData")
	public Object[][] getData(){
		Object[][] data = new Object[2][5];
		data[0][0]="Infosys";
		data[0][1]="Indirani";
		data[0][2]="Saptharishi";
		data[0][3]="indhusan.12@gmail.com";
		data[0][4]="9597353282";
		
		data[1][0]="Cognizant";
		data[1][1]="Anand";
		data[1][2]="Thiagarajan";
		data[1][3]="anand@gmail.com";
		data[1][4]="9841210114";
		
		return data;
	}
	
	@Test(dataProvider="getLeadData",threadPoolSize=2,description="Creates two different leads")
	public void createLead(String CompanyName,String firstname,String Lastname,String emailid,String phonenumber) {
		
		clickByLinkText("Leads");
        clickByLinkText("Create Lead");
		enterTextbyID("createLeadForm_companyName", CompanyName);
		enterTextbyID("createLeadForm_firstName", firstname);
		enterTextbyID("createLeadForm_lastName", Lastname);
		System.out.println("CompanyName:" +CompanyName+" and firstname:" +firstname+" and Lastname:" +Lastname);
		dropdownSelectByIdByIndex("createLeadForm_dataSourceId", 1);
		dropdownSelectByIdByValue("createLeadForm_marketingCampaignId", "CATRQ_CARNDRIVER");
		enterTextbyID("createLeadForm_primaryEmail", emailid);
		enterTextbyID("createLeadForm_primaryPhoneNumber", phonenumber);
		clickByClass("smallSubmit");
		String str1=getTextById("viewLead_companyName_sp");
		//int strlength=str1.length();
		//String leadid=str1.substring(strlength-6,strlength-1);
		 leadid[i] = (str1.substring(str1.indexOf("(") +1,str1.indexOf(")")));
	    System.out.println("The lead id is:" +leadid[i]);
	    i++;
		
		
	}
  
    @Test(dependsOnMethods="createLead",description="Merges the two leads")
	public void mergeLead() throws InterruptedException{
    	
    	clickByLinkText("Leads");
		clickByLinkText("Merge Leads");
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[1]");
		switchtolastwindow();
		Thread.sleep(3000);
		System.out.println("Actual Vaue" + leadid[0]);
		enterTextByName("id", leadid[0]);
		clickByXpath("//button[@class='x-btn-text'][1]");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[1]");
		switchToParentwindow();
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[2]");
		switchtolastwindow();
		enterTextByName("id", leadid[1]);
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
		if (!clickByLinkText(leadid[0])) {
			System.out.println("Leads Merged");
		} else {
			System.out.println("Merge doesn't happen");
		}
	}
		
	}


