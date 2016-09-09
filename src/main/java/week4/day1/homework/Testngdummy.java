package week4.day1.homework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Testngdummy {
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
		System.out.println("Launch the browser and login the app and click CRM/SFA");
		
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser(){
		System.out.println("Close the current application");
		
	}
}
