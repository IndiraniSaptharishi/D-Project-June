package week2.day2.homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\June\\drivers\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     //Get URL
	     driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	     //maximise window
	     driver.manage().window().maximize();
	     //Implict wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     //Total number of frames
	     List<WebElement> frames=driver.findElementsByTagName("iframe");
	     System.out.println("Total number of frames within the application:" +frames.size());
	     //No of frames in frame1
	     driver.switchTo().frame(0);
	     List<WebElement> frame1=driver.findElementsByTagName("iframe");
	     System.out.println("No. of frames within frame1:" +frame1.size());
	     driver.switchTo().defaultContent();
	     //No of frames in frame2
	     driver.switchTo().frame(1);
	     List<WebElement> frame2= driver.findElementsByTagName("iframe");
	     System.out.println("No of frames within frame2:" +frame2.size());
	     driver.switchTo().defaultContent();
	     //No of frames in frame3
	     driver.switchTo().frame(2);
	     List<WebElement> frame3= driver.findElementsByTagName("iframe");
	     System.out.println("No of frames within frame3:" +frame3.size());
	     driver.switchTo().defaultContent();
	     //No of frames in frame4
	     driver.switchTo().frame(3);
	     List<WebElement> frame4= driver.findElementsByTagName("iframe");
	     System.out.println("No of frames within frame4:" +frame4.size());
	     driver.switchTo().defaultContent();
	     //No of frames in frame5
	     driver.switchTo().frame(4);
	     List<WebElement> frame5= driver.findElementsByTagName("iframe");
	     System.out.println("No of frames within frame5:" +frame5.size());
	     driver.close();
	}

}
