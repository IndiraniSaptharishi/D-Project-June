package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

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
				driver.get("http://jqueryui.com/droppable/");
				
				// Go to the frame
				driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
				
				// Find the element to be dragged
				WebElement draggable = driver.findElement(By.id("draggable"));
				WebElement droppable = driver.findElement(By.id("droppable"));
				//Actions class creation
				Actions bulider=new Actions(driver);
				System.out.println("Position:" +draggable.getLocation());
				bulider.dragAndDrop(draggable, droppable).build().perform();
				System.out.println("Position:" +draggable.getLocation());
				System.out.println("The text in the droppable element:" +droppable.getText());
				
	}

}
