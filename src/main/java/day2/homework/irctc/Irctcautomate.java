package day2.homework.irctc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcautomate {

	public static void main(String[] args) throws InterruptedException {
		//Launch Firefox
		FirefoxDriver driver = new FirefoxDriver();
		//Open URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//Maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter UserID
		driver.findElementById("userRegistrationForm:userName").sendKeys("indhu1203");
		//check availability
		driver.findElementById("userRegistrationForm:checkavail").click();
		//Enter Password
		driver.findElementById("userRegistrationForm:password").sendKeys("Tambaram12");
		//Confirm Password
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Tambaram12");
		//Find the dropdown element
		Select dropdownSQ =new Select(driver.findElementById("userRegistrationForm:securityQ"));
		//Select the dropdown by index value
		dropdownSQ.selectByIndex(1);
		//Forceful wait for 30 secs
		Thread.sleep(3000);
		//Enter security question answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Indhu");
		//Find the dropdown element
		Select dropdownPL =new Select(driver.findElementById("userRegistrationForm:prelan"));
		//select preferred language
		dropdownPL.selectByValue("en");
		Thread.sleep(3000);
		//Enter Firstname
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Indirani");
		//Enter Lastname
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Saptharishi");
		//Enter Gender
		driver.findElementById("userRegistrationForm:gender:1").click();
		//Enter Marital status
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		//Find the dropdown element of Date in DOB field
		Select dropdowndate =new Select(driver.findElementById("userRegistrationForm:dobDay"));
		dropdowndate.selectByVisibleText("12");
		Thread.sleep(3000);
		//Find dropdown Element of month in  DOB field
		Select dropdownmonth =new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		dropdownmonth.selectByVisibleText("MAR");
		Thread.sleep(3000);
		//Find dropdown elemnt of year in DOB field
		Select dropdownyear =new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		dropdownyear.selectByVisibleText("1989");
		Thread.sleep(3000);
		//find the dropdown element occupation
		Select dropdownocc =new Select(driver.findElementById("userRegistrationForm:occupation"));
		//Select occupation
		dropdownocc.selectByValue("3");
		Thread.sleep(3000);
		//Enter email id
		driver.findElementById("userRegistrationForm:email").sendKeys("indhusan.12@gmail.com");
		//Enter mobile no
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9597353282");
		//Find the dropdown element Nationality
		Select dropdownnation = new Select (driver.findElementById("userRegistrationForm:nationalityId"));
		dropdownnation.selectByIndex(1);
		Thread.sleep(3000);
		//Enter Flat no
		driver.findElementById("userRegistrationForm:address").sendKeys("F4");
		//Enter street
		driver.findElementById("userRegistrationForm:street").sendKeys("Ragavendra Salai");
		//Find the dropdown element country
		Select dropdowncountry=new Select(driver.findElementById("userRegistrationForm:countries"));
		dropdowncountry.selectByValue("94");
		Thread.sleep(3000);
		//Enter pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600064");
		Thread.sleep(3000);
		//Enter landline
		driver.findElementById("userRegistrationForm:landline").sendKeys("0442646278");
        //locate the element state
		driver.findElementById("userRegistrationForm:statesName").getText();
		Thread.sleep(3000);
		//locate the dropdown element city
		Select dropdowncity=new Select(driver.findElementById("userRegistrationForm:cityName"));
		//Get always the first option
		dropdowncity.selectByIndex(1);
		Thread.sleep(3000);
		//locate the dropdown element post office 
		Select dropdownpost=new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		// get the first value
		dropdownpost.selectByIndex(1);
		Thread.sleep(3000);  
	
		//Address Radio check
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
			
	}
}
