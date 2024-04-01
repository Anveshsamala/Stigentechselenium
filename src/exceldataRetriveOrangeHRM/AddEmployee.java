package exceldataRetriveOrangeHRM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class AddEmployee extends BaseClassexcel
{

	//Add Employee script
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BaseClassexcel base=new BaseClassexcel();
		base.openBrowser();
		base.login();
		base.addEmployee();
		base.logout();
		base.closeBrowser();
	}

}
