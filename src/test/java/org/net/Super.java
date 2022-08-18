package org.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Super {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\HP\\eclipse-workspace\\JaiSurya\\src\\test\\resources\\TestData\\ExcelWrite.xlsx");
boolean a = f.createNewFile();
System.out.println(a);
Workbook w = new XSSFWorkbook();
Sheet s = w.createSheet("surya");

Row r = s.createRow(0);

Cell c = r.createCell(1);
c.setCellValue("The password that you've entered is incorrect. Forgotten password?");

FileOutputStream fout = new FileOutputStream(f);
w.write(fout);
System.out.println("success");

}
}
