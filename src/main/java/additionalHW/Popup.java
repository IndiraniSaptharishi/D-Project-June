package additionalHW;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("http://popuptest.com/");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     //click Multi popupTest2
	     driver.findElementByXPath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[2]/b/a").click();
	     //store parent windowhandle
	     String parentwindow=driver.getWindowHandle();
	     //Print no of windows opened
	     Set<String> Totalwindows= driver.getWindowHandles();
	     System.out.println("Number of windows opened:" +Totalwindows.size());
	     
	     for (String eachwindow : Totalwindows) {
	    	 if(!eachwindow.equals(parentwindow)){
	    	 driver.switchTo().window(eachwindow);
	    	 System.out.println("The URL is :" +driver.getCurrentUrl());
	    	 System.out.println("Title is :" +driver.getTitle());
	    	 driver.close();
	    	 }
	    	}
	     driver.switchTo().window(parentwindow);
	     System.out.println("The URL is :" +driver.getCurrentUrl());
    	 System.out.println("Title is :" +driver.getTitle());
	}

}
