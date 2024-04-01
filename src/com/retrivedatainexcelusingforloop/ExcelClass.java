package com.retrivedatainexcelusingforloop;

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

public class ExcelClass 
{
	public static String file="C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\poi\\Readdata.xlsx";
	public static FileInputStream fis;
	public static Workbook workbook;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
	public static String readdata(String sheetname, int rownumber,int cellnumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownumber);
		cell=row.getCell(cellnumber);
		String data=cell.getStringCellValue();
		return data;
	}
	public static int lastrownum(String sheetname)
	{
		int rowcount=sheet.getLastRowNum();
		return rowcount;
	}
	public static int lastcolumnnum(String sheetname)
	{
		int columncount=sheet.getRow(1).getLastCellNum();
		return columncount;
	}
	
}
