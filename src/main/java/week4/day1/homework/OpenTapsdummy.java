package week4.day1.homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenTapsdummy extends Testngdummy {
	@DataProvider(name="getLeadData")
	public Object[][] getData(){
		Object[][] data = new Object[2][3];
		data[0][0]="Infosys";
		data[0][1]="Indirani";
		data[0][2]="Saptharishi";
		
		
		data[1][0]="Cognizant";
		data[1][1]="Anand";
		data[1][2]="Thiagarajan";
		return data;
	}

 
	@Test(dataProvider="getLeadData",threadPoolSize=2,description="Creates two different leads")
	public void createLead(String companyname,String firstname,String lastname) {
		System.out.println("Create leads with two different data in parallel");
		System.out.println("Companyname:"+companyname+ "Firstname:" +firstname+ "Lastname:" +lastname);
	}
  
	@Test(dependsOnMethods="createLead",invocationTimeOut=10000,description="Edits the leaddata")
	public void editLead() throws InterruptedException{
		
		System.out.println("Edit the lead that is been created");
	}
	@Test(dependsOnMethods={"editLead","createLead"},enabled=false,description="Merges the two leads")
	public void mergeLead(){
		
		System.out.println("Merge the two different leads created");
}
}
