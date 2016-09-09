package week4.day1.homework;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import wrappermethods.WrapperClass;


public class TestngAnnotations extends WrapperClass {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am in before suite");
		
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("I am in before test ");
		
	}
	@BeforeMethod
    public void login()
	{
		launchApp("http://demo1.opentaps.org/","Chrome");
		enterTextbyID("username","DemoSalesManager");
		enterTextbyID("password","crmsfa");	
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser(){
		closeapp();
		
	}
	

}
