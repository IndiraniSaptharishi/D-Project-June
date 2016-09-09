package week2.homework;

import org.junit.Test;

import wrappermethods.WrapperClass;

public class Testcase1 extends WrapperClass{
	@Test
	
		public void Login()
		{
		login("Firefox", "DemoSalesManager", "crmsfa");
		String[] firstname= {"Indirani", "Anand"};
		String[] lastname= {"Saptharishi","Thiagarajan"};
		String[] email={"jjguava@testleaf.com","jjguava1@testleaf.com"};
		String[] phone={"9900990022","9000000001"};
		clickByLinkText("CRM/SFA");
		
			for(int i=0;i<=1;i++)
			{
				
				clickByLinkText("Create Lead");
				enterTextbyID("createLeadForm_companyName","JJGUAVA");
				enterTextbyID("createLeadForm_firstName",firstname[i]);
				enterTextbyID("createLeadForm_lastName",lastname[i]);
				dropdownSelectByIdByVisibletext("createLeadForm_dataSourceId","Partner");
				dropdownSelectByIdByVisibletext("createLeadForm_marketingCampaignId","Automobile");
				enterTextbyID("createLeadForm_primaryEmail",email[i]);
				enterTextbyID("createLeadForm_primaryPhoneNumber",phone[i]);
				clickbyname("submitButton");
				
		String companyName=getTextById("viewLead_companyName_sp");
		int strlength=companyName.length();
			String leadid=companyName.substring(strlength-6,strlength-1);
			
			System.out.println(leadid);
			}
		
		
		}
	}

