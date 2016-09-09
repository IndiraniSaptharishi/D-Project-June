package week2.day2.homework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("http://demo1.opentaps.org/opentaps/control/main");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     //store parent windowhandle
	     String parentwindow=driver.getWindowHandle();
	     //Enter username
	     driver.findElementById("username").sendKeys("DemoSalesManager");
	     //Enter password
	     driver.findElementById("password").sendKeys("crmsfa");
	     //Click login
	     driver.findElementByClassName("decorativeSubmit").click();
	     //click on the link CRM/SFA
	     driver.findElementByLinkText("CRM/SFA").click();
	     //Click on the leads in the tab
	     driver.findElementByLinkText("Leads").click();
	     //Click on merge leads
	     driver.findElementByLinkText("Merge Leads").click();
	     //Click on lead icon
	     driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
	     //switch over the other window
	     Set<String> wHandles =driver.getWindowHandles();
	     System.out.println("number of windows :"+wHandles.size());
	     for (String whandle : wHandles) {
			driver.switchTo().window(whandle);
			}
	    //Enter lead id
	     driver.findElementByXPath("//input[@name='id']").sendKeys("10003");
	     
	     //Click on find leads 1
	     driver.findElementByXPath("//button[@class='x-btn-text'][1]").click();
	     driver.switchTo().window(parentwindow);
	    	     //Click on  to leads icon
	   driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
	 //switch over the other window
	     Set<String> wHandles1 =driver.getWindowHandles();
	     System.out.println("number of windows :"+wHandles1.size());
	     for (String whandle : wHandles1) {
			driver.switchTo().window(whandle);
			}
	   //Enter lead id
	     driver.findElementByXPath("//input[@name='id']").sendKeys("10004");
	     //Click on find leads 1
	     driver.findElementByXPath("//button[@class='x-btn-text'][1]").click();
	     driver.switchTo().window(parentwindow); 
	     //click on merge button
	     driver.findElementByXPath("//a[@class='buttonDangerous']").click();
	     
	     //switch to the alert window
	     System.out.println("The text is :" +driver.switchTo().alert().getText());
	     Thread.sleep(3000);
	     driver.switchTo().alert().dismiss();
	     driver.close();
	}

}
