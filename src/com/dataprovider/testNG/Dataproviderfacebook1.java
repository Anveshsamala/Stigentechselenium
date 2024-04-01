package com.dataprovider.testNG;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderfacebook1 
{
	@Test(dataProvider="getdata")
	public void setdata(String username,String password)
	{
//		System.out.println("user name is= "+username);
//		System.out.println("password is = "+password);
		
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] facebookdata=new Object[3][2];
		facebookdata[0][0]="samalaanvesh";
		facebookdata[0][1]="Rahul123@";
		
		facebookdata[1][0]="samalarahul";
		facebookdata[1][1]="Rahul123@";
		
		facebookdata[2][0]="samalasrinivas";
		facebookdata[2][1]="Anvesh123@";
		
		return facebookdata;
	}
}
