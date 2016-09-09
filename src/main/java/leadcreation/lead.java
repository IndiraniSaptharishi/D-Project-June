package leadcreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch Firefox
		FirefoxDriver driver =new FirefoxDriver();
		//Open URL
		driver.get("http://demo1.opentaps.org");
		//Maxmize Firefox
		driver.manage().window().maximize();
		//Timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//Click on link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click create lead
		driver.findElementByLinkText("Create Lead").click();
		//Enter Company name
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		//Enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Indirani");
		//Enter Lastname
		driver.findElementById("createLeadForm_lastName").sendKeys("Saptharishi");
		//Click Create lead
		driver.findElementByClassName("smallSubmit").click();
		//Print Titlename
		System.out.println(driver.findElementById("sectionHeaderTitle_leads").getText());
		//Print company name and Id of the lead created
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		driver.close();
	}//closing main method

}//closing class
