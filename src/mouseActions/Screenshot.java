package mouseActions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		EventFiringWebDriver event=new EventFiringWebDriver(driver);
//		File f1=event.getScreenshotAs(OutputType.FILE);
//		File f2=new File("C:\\Screenshot\\abcd.jpg");
//		FileUtils.copyFile(f1, f2);
		
		TakesScreenshot ref=(TakesScreenshot) driver;
		File f3=ref.getScreenshotAs(OutputType.FILE);
		File f4=new File("scrshot.jpg");
		FileUtils.moveFile(f3, f4);
	}

}
