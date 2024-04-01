package exceldataRetriveOrangeHRM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClassexcel extends Exceldata
{
	public static WebDriver driver;
	//open browser
	public void openBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String url=Exceldata.readData("Login", 1, 0);
		driver.get(url);

	}
	//Login
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String username=Exceldata.readData("Login", 1, 1);
		String password=Exceldata.readData("Login", 1, 2);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	//Logout
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		action.click().build().perform();
		Thread.sleep(3000);
	}
	//close browser
	public void closeBrowser()
	{
		driver.close();
	}
	public void addEmployee() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		int rowcoun=Exceldata.rowcount("Addemployee");
		int colcoun=Exceldata.colcount("Addemployee");
		for(int i=1;i<=rowcoun;i++)
		{
			
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
			Actions a=new Actions(driver);
			a.moveToElement(ele).build().perform();
			driver.findElement(By.id("menu_pim_addEmployee")).click();

			System.out.println(rowcoun);
			System.out.println(colcoun);
			driver.findElement(By.name("chkLogin")).click();
			
			
			for(int j=0;j<colcoun;j++)
			{
				//System.out.println("Add emloyee method");
				
			//	String data[]= {"firstname","lastname","username","password","confirmpassword"};

				if(j==0) {
				String firstname=readData("Addemployee", i, j);
				driver.findElement(By.name("firstName")).sendKeys(firstname);
				
				}
				
				if(j==1) {
				String lastname=readData("Addemployee", i, j);
				driver.findElement(By.id("lastName")).sendKeys(lastname);
				}
				Thread.sleep(1000);
				if(j==2) {
				String user=readData("Addemployee", i, j);
				driver.findElement(By.id("user_name")).sendKeys(user);
				}
				
				Thread.sleep(1000);
				if(j==3) {
				String password=readData("Addemployee", i, j);
				driver.findElement(By.id("user_password")).sendKeys(password);
				}
				Thread.sleep(1000);
				if(j==4) {
				String confirmpassword=readData("Addemployee", i, j);
				driver.findElement(By.xpath("//*[@id=\"re_password\"]")).sendKeys(confirmpassword);
				
				}
				
				Thread.sleep(1000);

			}
			driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
			System.out.println("SucceSS FullY AddeD");
			Thread.sleep(3000);
		}
	}
}
