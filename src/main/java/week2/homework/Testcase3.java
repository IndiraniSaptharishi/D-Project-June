package week2.homework;

import org.junit.Test;

import wrappermethods.WrapperClass;

public class Testcase3 extends WrapperClass{
	@Test
	public void DeleteLead() throws InterruptedException{
		launchApp("http://demo1.opentaps.org/opentaps/control/main", "Chrome");
		enterTextbyID("username", "DemoSalesManager");
		enterTextbyID("password", "crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByXpath("//span[contains(text(),'Phone')]");
		enterTextByXpath("//input[@name='phoneNumber']", "9597353282");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		clickByXpath("(//a[@class='linktext'])[4]");
		clickByLinkText("Delete");
		enterTextByXpath("//input[@name='query']", "10004");
		clickByXpath("( //button[@class='x-btn-text'])[1]");
	}
	}


