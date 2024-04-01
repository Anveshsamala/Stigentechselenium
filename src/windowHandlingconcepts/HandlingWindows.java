package windowHandlingconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Set<String> allchildwin=driver.getWindowHandles();
		Iterator<String> it=allchildwin.iterator();
		while (it.hasNext()) {
			String child = it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());		
			}
		}
		driver.switchTo().window(parent);


	}

}
