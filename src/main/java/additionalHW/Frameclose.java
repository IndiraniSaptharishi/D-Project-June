package additionalHW;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameclose {

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
	     //no of frames
	     List<WebElement> totalframes= driver.findElementsByTagName("iframe");
	     System.out.println("Total number of frames in the page:" +totalframes.size());
	     //Close Iframe West (using "Close Me" button)
	     driver.switchTo().frame("childIframe");
	     driver.findElementByXPath("/html/body/div[2]/p/button").click();
	     driver.switchTo().defaultContent();
	     //Close West (using "Close Me" button)
	     driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
	     driver.switchTo().defaultContent();
         //Close Iframe East (using "Close Me" button)
	     driver.switchTo().frame("childIframe");
	     driver.findElementByXPath("/html/body/div[3]/p/button").click();
	     driver.switchTo().defaultContent();
	     //Close East (using "Close Me" button)
	     driver.findElementByXPath("/html/body/div[2]/p/button").click();
	     driver.switchTo().defaultContent();
	     
	}

}
