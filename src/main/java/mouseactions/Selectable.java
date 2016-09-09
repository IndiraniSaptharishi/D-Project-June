package mouseactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selectable {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// Set the system properties
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("firefox");
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://10.0.0.37:4444/wd/hub"),dc);
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		//ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("http://jqueryui.com/selectable/");

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		// find the first element
		WebElement list1=driver.findElementByXPath("(//li[@class='ui-widget-content ui-selectee'])[1]");
		// find the third element
		WebElement list3=driver.findElementByXPath("(//li[@class='ui-widget-content ui-selectee'])[3]");
		//actions class creation
		Actions bulider=new Actions(driver);
		bulider.clickAndHold(list1).clickAndHold(list3).build().perform();

	}

}
