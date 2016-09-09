package dropdownquestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberOfDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Firefox
				FirefoxDriver driver = new FirefoxDriver();
				//open the URL
				driver.get("https://developer.salesforce.com/");
				//maximise window
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//Navigate to SignUp page
				driver.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
				//Find the dropdown element Role
				Select dropdownRole =new Select(driver.findElementById("job_role"));
				//Get all the options
				List<WebElement> allOptions= dropdownRole.getOptions();
				
				for( WebElement eachOption:allOptions){
					if(allOptions.indexOf(eachOption)!=0){
						System.out.println("Values in the dropdown:" +eachOption.getText());
					}
					
					
					}
				}
	}


