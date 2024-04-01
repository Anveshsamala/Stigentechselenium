package com.dataprovider.testNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 
{
	@Test(dataProvider="getdata")
public void setdata(String username,String password)
{
	System.out.println("enter user  name= "+username);
	System.out.println("enter password ="+password);
}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="pass1";
		
		data[1][0]="user2";
		data[1][1]="pass2";
		
		data[2][0]="user3";
		data[2][1]="pass3";
		
		return data;
	}
}
