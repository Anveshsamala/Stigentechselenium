package exceldataRetriveOrangeHRM;
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
public class Exceldata {
	static String file="C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\poi\\Readdata.xlsx";
	public static String readData(String sheetname, int rownumber, int colnumber) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		String s=workbook.getSheet(sheetname).getRow(rownumber).getCell(colnumber).getStringCellValue();
		return s;
	}
	public static void writeData(String sheetname, int rownumber, int colnumber,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		workbook.getSheet(sheetname).createRow(rownumber).createCell(colnumber).setCellValue("Success");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}
	public static int rowcount(String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		//Row row=sheet.getRow(5);
		return sheet.getLastRowNum();
	}
	public static int colcount(String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(1);
		return sheet.getRow(1).getLastCellNum();
		
	}
}
