package week2.homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforcedropdowns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
  //Get URL
    driver.get("https://developer.salesforce.com");
    //maximise window
    driver.manage().window().maximize();
    //Implict wait
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    //Locate the sign up element
    driver.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
    //number of dropdowns in the signup page
    List<WebElement> allDropdowns=driver.findElementsByTagName("select");
    System.out.println("The number of dropdowns in sign up page:" +allDropdowns.size());
}
}
