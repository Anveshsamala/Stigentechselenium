package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatainExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		//		FileInputStream fis = new FileInputStream("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\poi\\Readdata.xlsx");
		//		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//		XSSFRow row=sheet.getRow(2);
		//		XSSFCell cell=row.getCell(2);
		//		String s=cell.getStringCellValue();
		//		//System.out.println(s);
		//		System.out.println(sheet.getRow(2).getCell(2));

		//retrive data from sheet
		FileInputStream fis=new FileInputStream("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\poi\\Readdata.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet s=workbook.getSheet("Sheet1");
		Row r=s.getRow(2);
		Cell c=r.getCell(3);
		String s2=c.getStringCellValue();
		
		System.out.println(s2);
//		String s1=workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(s1);
//		//Enter data into the sheet
//		workbook.getSheet("Sheet2").createRow(2).createCell(3).setCellValue("SELENIUM");
//		FileOutputStream fos=new FileOutputStream("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\poi\\Readdata.xlsx");
//		workbook.write(fos);
		System.out.println("Excution success");



	}

}
