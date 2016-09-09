package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     //switch to frames
	     driver.switchTo().frame("iframeResult");
	     driver.findElementByXPath("/html/body/button").click();
	     //switch to alert
	     
	    //System.out.println("the alert text is :" +driver.switchTo().alert().getText());
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
	    driver.findElementById("demo").getText();
	     
	}

}
