package fileUploading;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileUsingAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Anvesh/Desktop/STIGENTECH/SELENIUM/FileUpload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("myFile")).click();
		
		Runtime.getRuntime().exec("C:\\\\Users\\\\Anvesh\\\\Desktop\\\\STIGENTECH\\\\SELENIUM\\\\AutoIt Software\\\\btechmemo.exe");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();

	}

}
