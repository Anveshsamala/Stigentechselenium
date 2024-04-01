package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx1 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite method for before Project");
	}
				@BeforeTest
				public void beforeTest()
				{
					System.out.println("BeforeTest method for before Package");
				}
						@BeforeClass
						public void beforeClass()
						{
							System.out.println("BeforeClass method for before Class");
						}
							@BeforeMethod
							public void beforeMethod()
							{
								System.out.println("BeforeMethod method for before method");
							}
								@Test
								public void maintest1()
								{
									System.out.println("Main method 1");
								}
								@Test
								public void maintest2()
								{
									System.out.println("Main method 2");
								}
							@AfterMethod
							public void afterMethod()
							{
								System.out.println("afterMethod method for after method");
							}
						@AfterClass
						public void afterClass()
						{
							System.out.println("afterClass method for after Class");
						}
				@AfterTest
				public void afterTest()
				{
					System.out.println("afterTest method for after Package");
				}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite method for after Suite");
	}
}
