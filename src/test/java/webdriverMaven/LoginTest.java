package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[ng-click='manager()']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[ng-click='addCust()']")).click();
		driver.findElement(By.cssSelector("input[ng-model='fName']")).click();
		
				
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
