package com.retrivedatainexcelusingforloop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import exceldataRetriveOrangeHRM.Exceldata;



public class BaseClass extends ExcelClass
{
	public static WebDriver driver;
	public void openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String url=ExcelClass.readdata("Login", 1, 0);
		driver.get(url);
	}
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String username=ExcelClass.readdata("Login", 1, 1);
		String password=ExcelClass.readdata("Login", 1, 2);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		action.click().build().perform();
		Thread.sleep(3000);
	}
	public void closeBrowser()
	{
		driver.close();
	}
	
	
//	public Object[][] retrivealldata()
//	{
//		
//		Object[][] abc=new Object[lastrownum("Sheet1")][lastcolumnnum("Sheet1")];
//		for(int row=1;row<lastrownum("Sheet1");row++)
//		{
//			for(int cell=0;cell<lastcolumnnum("Sheet1");cell++)
//			{
//				abc[row][cell]=sheet.getRow(row).getCell(cell).toString();
//			}
//		}
//		return abc;
//	}
}
