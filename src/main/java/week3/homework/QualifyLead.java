package week3.homework;

import org.junit.Test;

import wrappermethods.WrapperClass;

public class QualifyLead extends WrapperClass {
 @Test
 public void convertLead(){
	 launchApp("http://demo1.opentaps.org/opentaps/control/main", "chrome");
		enterTextbyID("username", "DemoSalesManager");
		enterTextbyID("password", "crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterTextByXpath("//input[@name='emailAddress']", "anand@gmail.com");
		clickByXpath("(//button[@type='button'])[7]");
		clickByLinkText("10030");
		clickByLinkText("Qualify Lead");
		clickByLinkText("Convert Lead");
		clickByXpath("//img[@src='/images/fieldlookup.gif']");
		switchtolastwindow();
		clickByLinkText("accountlimit100");
		switchToParentwindow();
		clickByXpath("//input[@name='submitButton']");
		VerifyTextByLinkText("Credit Limited Account (accountlimit100)", "Credit Limited Account");
		
		}
 }

