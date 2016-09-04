package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.google.com.vn/");
		driver.findElement(By.id("lst-ib")).sendKeys("guru99");
		driver.findElement(By.name("btnG")).click();
	}

	@BeforeTest
	public void beforeTest() {
		// voi browser=firefox

		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		//lala

		// voi browser = chrome
		
		 /*System.setProperty("webdriver.chrome.driver",
		 System.getProperty("user.dir") +"\\Setup\\chromedriver.exe");
		 driver=new ChromeDriver();*/
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
