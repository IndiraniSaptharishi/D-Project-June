package week4.day1.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Writinginexcel {

	@Test
	public void writeExcel(){
	

	        WebDriver driver = new FirefoxDriver();

	        driver.get("http://www.google.com");

	        driver.manage().window().maximize();  
	      
	        WebElement searchbox = driver.findElement(By.name("q"));

	 try {
	   
	  FileInputStream file = new FileInputStream(new File("./data/MergeLead.xls")); 
	  HSSFWorkbook workbook = new HSSFWorkbook(file);

	  HSSFSheet sheet = workbook.getSheetAt(0);
	  for (int i=1; i <= sheet.getLastRowNum(); i++){

	        String keyword = sheet.getRow(i).getCell(0).getStringCellValue();

	        searchbox.sendKeys(keyword);

	        searchbox.submit();       
	 
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

	}

	  workbook.close();
	  file.close();

	 } catch (FileNotFoundException fnfe) {
	  fnfe.printStackTrace();
	 } catch (IOException ioe) {
	  ioe.printStackTrace();
	 }
	 }
	
		
	}

