package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathall 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Normal Xpath
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	
	//xpath with contains
	
	driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
	
	//xpath with only text()
	driver.findElement(By.xpath("//*[text()='Log in']")).click();
	//xpath with preceding 
	driver.findElement(By.xpath("//input[@id='txtUsername']//preceding::input")).isEnabled();
	
	//xpath with following
	
	driver.findElement(By.xpath("//input[@id='txtUsername']//following::input")).isDisplayed();
	
	//xath start-with
	
	driver.findElement(By.xpath("//")).isDisplayed();
	
	//input[@id='txtUsername' or @name='txtUsername']
	
	//input[@id='txtUsername' and @name='txtUsername']
	}
}
