package classwork.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chromerun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch Chrome
				System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				//open the URL
				driver.get("https://developer.salesforce.com/");
				//maximise window
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Navigate to SignUp page
				driver.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
				//Find the dropdown element Role
				Select dropdownRole =new Select(driver.findElementById("job_role"));
				dropdownRole.selectByVisibleText("Administrator");
				Thread.sleep(3000);
				//Get all the options
				List<WebElement> allOptions= dropdownRole.getOptions();
				//Find the dropdown element lastcountry
				Select dropdowncountry=new Select(driver.findElementById("country"));
				//Get all options from the field country
				List<WebElement> allOptionscountry=dropdowncountry.getOptions();
				//Enter the dropdown lastcountry
				int lastcountry =allOptionscountry.size()-1;
				dropdowncountry.selectByIndex(lastcountry);
				Thread.sleep(3000);
				
				//Print all the options
				System.out.println("All options in the dropdown Role are");
				for( WebElement eachOption:allOptions){
					System.out.println(eachOption.getText());
				}
				driver.close();

	}

}
