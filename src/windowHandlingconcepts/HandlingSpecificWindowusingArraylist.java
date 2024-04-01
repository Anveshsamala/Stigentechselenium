package windowHandlingconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSpecificWindowusingArraylist {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	String parent=driver.getWindowHandle();
	Set<String> allwindows=driver.getWindowHandles();
	
	ArrayList<String> childwindow = new ArrayList<String>(allwindows);
	System.out.println(childwindow.size());
	driver.switchTo().window(childwindow.get(2));
	driver.close();
	driver.switchTo().window(childwindow.get(0));
	driver.close();
	driver.switchTo().window(childwindow.get(1));
	System.out.println(driver.switchTo().window(childwindow.get(1)));
	driver.manage().window().maximize();
	
	
}
}
