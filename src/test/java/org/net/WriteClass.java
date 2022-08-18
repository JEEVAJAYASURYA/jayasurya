package org.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteClass {
	public static WebDriver driver;
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	public static void printCurrentTitle() {
		System.out.println(driver.getCurrentUrl());

	}
	public static void passValue(WebElement ele,String value) {
	ele.sendKeys(value);
}
	public static void buttonClick(WebElement elu) {
		elu.click();

	}
	public static String getData1(int rownumber,int cellnumber) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\JaiSurya\\src\\test\\resources\\TestData\\TOOLS.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("SURYA");
		Row r = s.getRow(rownumber);
		Cell c = r.getCell(cellnumber);
		int cell = c.getCellType();
		String value="";
		if (cell==1) {
			 value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/YYYY");
			 value = sim.format(d);
			
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			 value = String.valueOf(d);
		}
return value;
	}

	
	public static void getData() throws IOException {
		
	
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\JaiSurya\\src\\test\\resources\\TestData\\TOOLS.xlsx");
	boolean a = f.createNewFile();
	System.out.println(a);
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("surya");
	
	Row r = s.createRow(0);
	
	Cell c = r.createCell(1);
	c.setCellValue("The email address you entered isn't connected to an account. Find your account and log in.");
	
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("success");
	}
}
		
		
		
		
		
		
	