package frameHandlingconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anvesh/Desktop/STIGENTECH/SELENIUM/HTML/HTML%20PAGES/TestIFramePage.html");
		Thread.sleep(2000);
		//switch to frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.name("lname12")).sendKeys("Anvesh");
		Thread.sleep(2000);
		//switch to main frame/parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.name("fname1")).sendKeys("Ramesh123");
		Thread.sleep(2000);
		//switch to frame2
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("vehicle1")).click();
		//switch to main frame/parent frame
		driver.switchTo().defaultContent();
		driver.findElement(By.name("lname1")).sendKeys("lavnya123");
		//switch to frame3
		driver.switchTo().frame("frame3");
		String text=driver.findElement(By.xpath("/html/body/fieldset/p[1]")).getText();
		System.out.println(text);
	}

}
