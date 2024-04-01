package windowHandlingconcepts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowUsingForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		for(String child:allwindows)
		{
			Thread.sleep(2000);
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
			}
		}
		driver.switchTo().window(parent);
	}

}
