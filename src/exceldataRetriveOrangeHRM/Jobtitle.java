package exceldataRetriveOrangeHRM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jobtitle extends BaseClassexcel  
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BaseClassexcel base=new BaseClassexcel();
		base.openBrowser();
		base.login();
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		Actions action=new Actions(driver);
		action.moveToElement(admin).build().perform();
		WebElement  job=driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
		action.moveToElement(job).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.name("jobTitle[jobTitle]")).sendKeys("JAabcde5949");
		driver.findElement(By.name("btnSave")).click();
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[16]/td[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"jobTitle_jobTitle\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"jobTitle_jobTitle\"]")).sendKeys("JAVAaaabc1805");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		
		WebElement im=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		action.moveToElement(im).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
		WebElement all=driver.findElement(By.xpath("//*[@id=\"empsearch_job_title\"]"));
		Select select=new Select(all);
		select.selectByVisibleText("Heaven");
		
		action.moveToElement(admin).build().perform();
		action.moveToElement(job).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnDelete\"]")).click();
		
	}
}
