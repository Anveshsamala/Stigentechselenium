package orangeHRM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HrmOrange {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/petsitcare/");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();

//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("welcome")).click();
//		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		
		
		
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
//		Actions a=new Actions(driver);
//		a.moveToElement(ele).build().perform();
//		driver.findElement(By.id("menu_pim_addEmployee")).click();
//		driver.findElement(By.className("formInputText")).sendKeys("Maheshh");
//		driver.findElement(By.id("lastName")).sendKeys("Sureshh");
//		driver.findElement(By.name("employeeId")).sendKeys("5949");
//		WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
//		a.moveToElement(choosefile).build().perform();
//		a.click().build().perform();
//
//		Thread.sleep(3000);
//		Runtime.getRuntime().exec("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\AutoIt Software\\Adharrahul.exe");
//
//		Thread.sleep(3000);
//		driver.findElement(By.name("chkLogin")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("user_name")).sendKeys("Maheshh");
//		driver.findElement(By.id("user_password")).sendKeys("Sureshh123@");
//		driver.findElement(By.id("re_password")).sendKeys("Sureshh123@");
//		//driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
//		WebElement ref=driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
//		a.moveToElement(ref).build().perform();
//		a.click().build().perform();









	}

}
