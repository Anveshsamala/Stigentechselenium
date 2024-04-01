package windowHandlingconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsUsingIteratorMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> it=allwindows.iterator();
		while(it.hasNext())
		{
			String child=it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				Thread.sleep(2000);
				
				driver.close();
			}
		}
		driver.switchTo().window(parent);

	}

}
