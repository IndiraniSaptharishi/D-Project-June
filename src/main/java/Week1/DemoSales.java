package Week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch Firefox
		FirefoxDriver driver = new FirefoxDriver();
		//Open URL
		driver.get("http://demo1.opentaps.org");
		//Maxmise Firefox
		driver.manage().window().maximize();
		//Default Timelimit
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Login Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//Print Welcome Message
		System.out.println(driver.findElementByXPath("//*[@id='form']/h2").getText());
		//Print title
		String Title =driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(Title);
		driver.close();
		
		}//closing the MainMethod

}//Closing the class
