package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("http://jqueryui.com/sortable/");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement element1=driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[1]");
		System.out.println("Current Position of item1"+element1.getLocation());
		WebElement element5=driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[5]");
		System.out.println("Current Position of the item5"+element5.getLocation());
       //Actions class
		Actions bulider=new Actions(driver);
		bulider.dragAndDropBy(element1,11, 144).build().perform();
		System.out.println("Current Position of the item1"+element1.getLocation());
	}

}
