package orangeHRM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyAddingEmployee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys("0016");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		//Comparing 
		String Exp=driver.findElement(By.xpath("//*[@id=\"empsearch_id\"]")).getAttribute("Value");
		
		String Act=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText();
		
		if(Exp.equals(Act))
		{
			System.out.println("Search element is present");
		}
		else
		{
			System.out.println("Search element NOT present");
		}
	}

}
