package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

public class BaseTest {
public static WebDriver driver;
	
	
	public static void intializeDriver() {
		System.setProperty("webdriver.chrome.driver","./Resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
	}
	
	
	public static void openBrowser() {
		driver.get("http://automationpractice.com/index.php");
	}
		
	
	public static void closeBrowser() {
		driver.quit();
	}
	
}
