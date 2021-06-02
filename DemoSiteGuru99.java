/*
 * Testiranje sajta http://demo.guru99.com/test/newtours/

Koristiti razlicite moguce lokatore za pronalazenje elemenata - isprobati vise nacina;
Zapamtiti lokacije u konstantama
Za registracionu formu popuniti bug report, koristiti vec prosledjen template- naci i napisiati bar 5 bagova. Testiranje sajta u ovu svrhu obaviti manuelno

 */

package domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteGuru99 {

	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String SIGNINPAGE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
	public static final String USERNAME_NAME = "userName";
	public static final String PASSWORD_NAME = "password";
	public static final String SUBMITS_CSS = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td > input[type=submit]";
	public static final String HOMEPAGE_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a";
	public static final String REGISTER_XPATH = "html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
    public static final String EMAIL_ID = "userName";
    public static final String FLIGHTS_CSS ="body > div:nth-child(5) > table > tbody > tr > td:nth-child(1) > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > a";
    public static final String PASSENGERSDRP_NAME = "passCount";
    
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(URL);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement signInPage = driver.findElement(By.xpath(SIGNINPAGE_XPATH));
		signInPage.click();

		WebElement username = driver.findElement(By.name(USERNAME_NAME));
		username.sendKeys("jelena");

		WebElement password = driver.findElement(By.name(PASSWORD_NAME));
		password.sendKeys("test123");

		WebElement submitSI = driver.findElement(By.cssSelector(SUBMITS_CSS));
		submitSI.click();

		driver.navigate().back();

		WebElement homePage = driver.findElement(By.xpath(HOMEPAGE_XPATH));
		homePage.click();

		WebElement register = driver.findElement(By.xpath(REGISTER_XPATH));
		register.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement email = driver.findElement(By.id(EMAIL_ID));
		email.sendKeys("jelena@mail.com");
		
		WebElement flightsPage = driver.findElement(By.cssSelector(FLIGHTS_CSS));
		flightsPage.click();
		
		WebElement passengersDrp = driver.findElement(By.name(PASSENGERSDRP_NAME));
		passengersDrp.sendKeys("3");

		driver.close();
		


	}

}
