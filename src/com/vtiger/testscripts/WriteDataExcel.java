package com.vtiger.testscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\USER\\OneDrive\\Documents\\DataStorageFile\\CreateExcel.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet s =book.createSheet("Data");
	
	s.createRow(1).createCell(3).setCellValue("Well");
	FileOutputStream fos = new FileOutputStream("C:\\Users\\USER\\OneDrive\\Documents\\DataStorageFile\\CreateExcel.xlsx");
	book.write(fos);
	fos.flush();
	System.out.println("pass");
	
	}
}
