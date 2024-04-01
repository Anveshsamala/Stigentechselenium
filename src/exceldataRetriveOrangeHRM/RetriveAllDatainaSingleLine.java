package exceldataRetriveOrangeHRM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class RetriveAllDatainaSingleLine {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\poi\\Readdata.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell col=row.getCell(0);
		int rowcount=row.getRowNum();
		int colcount=row.getLastCellNum();
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				System.out.println(workbook.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue());
			}
		}
				
		
//		XSSFWorkbook workbook=new XSSFWorkbook(fis);
//		
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
//		XSSFRow row=sheet.getRow(1);
//		XSSFCell cell;
//		int rowcount=sheet.getLastRowNum();
//		int colcount=sheet.getRow(1).getLastCellNum();
//		for(int i=1;i<rowcount;i++)
//		{
//			for(int j=0;j<colcount;j++)
//			{
//				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
//			}
//		}
}
}
