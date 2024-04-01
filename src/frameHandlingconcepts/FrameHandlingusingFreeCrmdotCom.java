package frameHandlingconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingusingFreeCrmdotCom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anvesh/Desktop/STIGENTECH/SELENIUM/Table.html");

		List<WebElement> rows=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		int rowscount=rows.size();
		System.out.println(rowscount);
		//--/html/body/table/tbody/tr[2]/td[1]
		//--/html/body/table/tbody/tr[3]/td[1]
		//--/html/body/table/tbody/tr[4]/td[1]
		String beforexpath="/html/body/table/tbody/tr[";
		String afterxpath="]/td[1]";
		for(int i=2;i<=rowscount;i++)
		{
			String actualxpath=beforexpath+i+afterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
		//*[@id="customers"]/
		//--/html/body/table/tbody/tr[2]/td[2]
		//--/html/body/table/tbody/tr[3]/td[2]
		//--/html/body/table/tbody/tr[4]/td[2]
		String afterxpathlastname="]/td[2]";
		for (int i = 2; i <=rowscount; i++) 
		{
			String xpathlastname=beforexpath+i+afterxpathlastname;
			WebElement elementlastname=driver.findElement(By.xpath(xpathlastname));
			System.out.println(elementlastname.getText());
		}

		//--/html/body/table/tbody/tr[2]/td[3]

		String afterxpathage="]/td[3]";
		for (int i = 2; i <=rowscount; i++) 
		{
			String xpathage=beforexpath+i+afterxpathage;
			WebElement elementlastname=driver.findElement(By.xpath(xpathage));
			System.out.println(elementlastname.getText());
		}
	}
}
