package com.seleniumsession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excelbook {
	public static void main(String[] args) throws Exception, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\AngelBroking1.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		org.apache.poi.ss.usermodel.Sheet s = wb.getSheet("Sheet1");

		String value = s.getRow(1).getCell(1).getStringCellValue();

		System.out.println(value);

	}
}
