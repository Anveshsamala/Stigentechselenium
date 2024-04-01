package exceldataRetriveOrangeHRM;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class VerifyAddEmployee extends BaseClassexcel
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BaseClassexcel base=new BaseClassexcel();
		base.openBrowser();
		base.login();
		//System.out.println("Add emloyee method");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		WebElement eee=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		a.click(eee).build().perform();
		driver.findElement(By.id("empsearch_id")).sendKeys("5949");
		driver.findElement(By.id("searchBtn")).click();
		//comparing id's
		Thread.sleep(3000);
		String exp=driver.findElement(By.id("empsearch_id")).getText();
		String act=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getAttribute("value");
		if(exp.equals(act))
		{
			Exceldata.writeData("Sheet2", 1, 9,"success");
		}
		else
		{
			Exceldata.writeData("Sheet2", 1, 9,"failure");
		}
		base.logout();
		base.closeBrowser();
	}
}
