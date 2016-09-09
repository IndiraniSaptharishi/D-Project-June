package week2.homework;

import org.junit.Test;

import wrappermethods.WrapperClass;

public class Testcase4 extends WrapperClass {
		@Test
		public void MergeLead(){
			launchApp("http://demo1.opentaps.org/opentaps/control/main", "Chrome");
			enterTextbyID("username", "DemoSalesManager");
			enterTextbyID("password", "crmsfa");
			clickByClass("decorativeSubmit");
			clickByLinkText("CRM/SFA");
			clickByLinkText("Leads");
			clickByLinkText("Merge Leads");
			clickByXpath("(//img[@src='/images/fieldlookup.gif'])[1]");
			switchtolastwindow();
			enterTextByXpath("//input[@name='id", "10002");
			clickByXpath("//button[@class='x-btn-text'][1]");
			switchToParentwindow();
			clickByXpath("(//img[@src='/images/fieldlookup.gif'])[2]");
			switchtolastwindow();
			enterTextByXpath("//input[@name='id']", "10004");
			clickByXpath("//button[@class='x-btn-text'][1]");
			switchToParentwindow();
			clickByXpath("//a[@class='buttonDangerous']");
			switchToAlert("accept");
		}
		
}
