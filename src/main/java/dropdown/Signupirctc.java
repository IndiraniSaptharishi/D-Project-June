package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Signupirctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// launch firefox
		FirefoxDriver driver = new FirefoxDriver();
		//Open URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//maximize window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Locate the dropdown element
		 Select dropdown = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		//select by index
		 dropdown.selectByIndex(4);
		 Thread.sleep(3000);
		 //select by value
		 dropdown.selectByValue("1");
		Thread.sleep(3000);
		 //Select by visible text
		 dropdown.selectByVisibleText("What make was your first car or bike?");
		 Thread.sleep(3000);
		//List all the options
		 List<WebElement> allOptions =dropdown.getOptions();
		 //Find the last option(Index value) in the dropdown
		 int lastindexvalue =allOptions.size()-1;
		 dropdown.selectByIndex(lastindexvalue);
		 //Print all the options -for each
		 System.out.println("All the options in the dropdown are as follows");
		 for( WebElement eachOption:allOptions){
		 System.out.println(eachOption.getText());
		 }
		 
		driver.close();
		
	}

}
