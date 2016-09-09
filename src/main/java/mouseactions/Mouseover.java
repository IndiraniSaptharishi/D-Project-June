package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement element=driver.findElementByXPath("(//img[@alt='User Avatar'])[1]");
		//Actions class creation
		Actions builder= new Actions(driver);
		builder.moveToElement(element).build().perform();
		String text=driver.findElementByXPath("//a[contains(text(),'View profile')]/preceding::h5").getText();
		System.out.println("Print the value:" +text);
		
	}

}
