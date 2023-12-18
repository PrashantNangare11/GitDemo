package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		FileInputStream fs=new FileInputStream("C:\\Users\\Nangare and Co\\eclipse-workspace\\Sandhya_Automation\\Excelsheet\\sandhyaExcel.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		
		//1st way to get excelsheet values
		Sheet s=wb.getSheet("login");
		Row r=s.getRow(1);
		Cell c=r.getCell(0);
	
		String username =c.getStringCellValue();
		System.out.println(username);  
		Row r1=s.getRow(1);
		Cell c1=r1.getCell(1);
		String password =c1.getStringCellValue();
		System.out.println(password);
		
		//2nd way to get excelsheet values
		String password1=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password1);
		
	}

}
