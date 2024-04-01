package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://stigentech.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//mouse Hovering
		WebElement element=driver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[2]/a/span"));
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		Thread.sleep(2000);
		//Right Click
		WebElement right=driver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[2]/ul/li[3]/a/span"));
		a.contextClick(right).build().perform();;
		//double click actions
		a.doubleClick(right).build().perform();
		
		
		

	}

}
