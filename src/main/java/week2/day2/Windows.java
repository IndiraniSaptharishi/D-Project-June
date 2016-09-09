package week2.day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     //store parent windowhandle
	     String parentwindow=driver.getWindowHandle();
	     
	     //click contact us
	     driver.findElementByLinkText("Contact Us").click();
	     Set<String> wHandles=driver.getWindowHandles();
	     System.out.println("number of windows :"+wHandles.size());
	     for (String whandle : wHandles) {
			driver.switchTo().window(whandle);
			}
	     System.out.println("the current URL" +driver.getCurrentUrl());
	     System.out.println("title of the current window:" +driver.getTitle());
	   driver.close();  
	   driver.switchTo().window(parentwindow);
	   System.out.println("the Parent URL" +driver.getCurrentUrl());
	   System.out.println("Title of the parent window is:"+driver.getTitle());

	}

}
