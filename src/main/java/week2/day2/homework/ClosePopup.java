package week2.day2.homework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosePopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Get URL
		driver.get("http://popuptest.com/");

		// maximise window
		driver.manage().window().maximize();
		// Implict wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// storing parent window
		
		// click on the multitest popuptest2
		driver.findElementByXPath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[2]/b/a").click();
		// Number of windows
		String parentwindow = driver.getWindowHandle();
		Set<String> whandles = driver.getWindowHandles();
		System.out.println("No. of windows:" + whandles.size());
		for (String eachwindow : whandles) {

			if (!eachwindow.equals(parentwindow)) {
				driver.switchTo().window(eachwindow);
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		System.out.println("Parentwindow URL" + driver.getCurrentUrl());
		System.out.println("title of the parent window:" + driver.getTitle());

	}

}
