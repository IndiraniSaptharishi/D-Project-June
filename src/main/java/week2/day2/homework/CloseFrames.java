package week2.day2.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     //Click button close me
	     driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
	     //switch to frame
	     driver.switchTo().frame("childIframe");
	     driver.findElementByXPath("/html/body/div[2]/p/button").click();
	     driver.switchTo().defaultContent();
	     //switch to the other frame
	     driver.switchTo().frame("childIframe");
	     driver.findElementByXPath("/html/body/div[3]/p/button").click();
	     driver.switchTo().defaultContent();
	     //Click the close me button 
	     driver.findElementByXPath("/html/body/div[2]/p/button").click();
	}

}
