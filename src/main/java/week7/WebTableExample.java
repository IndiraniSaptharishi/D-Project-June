package week7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableExample {
	static public void main(String[] args) throws InterruptedException {

		// FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://erail.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page
		// loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Enter Origin
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("txtStationFrom")));
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

		// Enter Destination
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MYS", Keys.TAB);

		WebElement table = driver.findElementByXPath("//div[@id='divTrainsList']/table[1]");

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		System.out.println(rows.size());
		

		for (WebElement eachrow : rows) {
			System.out.println(eachrow.getText());
		
			
		}

	}

}
