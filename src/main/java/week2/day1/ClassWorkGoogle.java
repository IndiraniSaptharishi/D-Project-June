package week2.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkGoogle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//Launch chrome
		
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//get URL
		   driver.get("https://www.google.co.in");
		//Maximise the window
		   driver.manage().window().maximize();
		//Implict wait
		   driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		//locate the element
	      driver.findElementById("lst-ib").sendKeys("Indirani",Keys.ENTER);
	      Thread.sleep(3000);
	//verify the title page
	
	 if (driver.getTitle().contains("Google")){
		 System.out.println("The Title contains Google");
	 }
	 else
	 {
		 System.out.println("Title doesn't contain Google");
	 }
	
	 List<WebElement> allLinks=driver.findElementsByTagName("a");
	 System.out.println("The number of links in the page :" +allLinks.size()); 
	 System.out.println("Color of the 10th link:" +allLinks.get(9).getCssValue("color"));
	 
	 for (WebElement link : allLinks) {
		if (link.getSize().width > 20){
			System.out.println("the links that has width greater than 20:" +link.getText());
		
		}
		}
	File img=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(img, new File ("./Snapshot/snap1"));
	}

}
