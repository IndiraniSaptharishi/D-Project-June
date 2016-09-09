package week2.homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opentaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
     ChromeDriver driver= new ChromeDriver();
     //Get URL
     driver.get("http://demo1.opentaps.org/opentaps/control/main");
     //maximise window
     driver.manage().window().maximize();
     //Implict wait
     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
     //Number of edit fields
     List<WebElement> allEditFields= driver.findElementsByClassName("inputLogin");
     System.out.println("The number of Edit fileds in the login page:" +allEditFields.size());
     
	}

}
