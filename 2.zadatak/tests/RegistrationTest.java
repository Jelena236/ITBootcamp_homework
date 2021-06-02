package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Home;
import objs.Registration;
import resources.Constants;

public class RegistrationTest {
	
	private static WebDriver driver;
	
	@BeforeClass 
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testRegBtn() {
		driver.navigate().to(Constants.URL);
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.URL1;
		
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test
	public void testFormReg() {
		driver.navigate().to(Constants.URL1);
		Registration.inputUsername(driver, "jelena");
		Registration.inputPassword(driver, "123");
		Registration.inputConfirmPass(driver, "123");
		Registration.sumbit(driver);
		
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl, expectedUrl);

	}

}
