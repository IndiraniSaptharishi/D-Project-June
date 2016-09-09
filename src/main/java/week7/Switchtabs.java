package week7;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //launch chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//get the URl
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=Kx3SV4T1GtWHoAPh05rADA&gws_rd=ssl#q=gmail+sign");
		//finding the link and opening in the new tab
		driver.findElementByCssSelector("body").sendKeys(Keys.chord(Keys.CONTROL,"t"));
		
	}

}
