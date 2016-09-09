package week3.homework;

import org.junit.Test;

import wrappermethods.WrapperClass;

public class DuplicateLead extends WrapperClass {
    @Test
	public void leadDuplicate(){
    	launchApp("http://demo1.opentaps.org/opentaps/control/main", "chrome");
		enterTextbyID("username", "DemoSalesManager");
		enterTextbyID("password", "crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterTextByXpath("//input[@name='emailAddress']", "indhusan@gmail.com");
		clickByXpath("(//button[@type='button'])[7]");
		clickByLinkText("10002");
		clickByLinkText("Duplicate Lead");
		getTextById("createLeadForm_firstName");
		clickByXpath("//input[@value='Create Lead']");
		VerifyTextByXpath("(//span[@class='tabletext'])[3]", "Infosys (10002)");
		String flag = null;
		if (flag =="False"){
			System.out.println("Test case passed");
		}else{
			System.out.println("Test case failed");
		}
    
    }
}
