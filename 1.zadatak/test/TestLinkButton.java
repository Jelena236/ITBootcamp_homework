package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import obj.Home;


public class TestLinkButton {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testNasaPrica() {
		driver.navigate().to(Home.URL);
		Home.clickNasaPrica(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://itbootcamp.rs/motivacija-i-ciljevi/";
		
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}

}
