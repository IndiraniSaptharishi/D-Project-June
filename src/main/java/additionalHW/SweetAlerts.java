package additionalHW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("http://t4t5.github.io/sweetalert/");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     //click show error msg under normal alert
	     driver.findElementByXPath("/html/body/div[1]/button").click();
	     Thread.sleep(3000);
	     System.out.println("text in the alert is :" +driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();
	     //click show error msg under sweet alert
	     driver.findElementByXPath("/html/body/div[2]/button").click();
	     //Print the text in the alert
	     System.out.println("The text in the alert is:" +driver.findElementByXPath("/html/body/div[6]/p").getText());
	     
	     driver.findElementByXPath("/html/body/div[6]/div[7]/div/button").click();
	     
	     

	}

}
