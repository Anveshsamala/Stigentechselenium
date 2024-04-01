package com.properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tproperties {
	public static File f;
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		f=new File("C:\\Users\\Anvesh\\eclipse-workspace\\Stigentechselenium\\src\\com\\properties\\my.properties");
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		driver=new ChromeDriver();
		prop=new Properties();
		fis=new FileInputStream(f);
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
}
