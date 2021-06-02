package selenium2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ITbootcamp {
	
	private static final String URL = "https://itbootcamp.rs/";
	private static final String KONTAKT_URL = "https://itbootcamp.rs/kontakt/";
	private static final String SEARCHBTN_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	private static final String SEARCHBOX_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 4);
		
		driver.get(URL);
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension pocetnaVelicina = driver.manage().window().getSize();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.navigate().to(KONTAKT_URL);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(SEARCHBTN_XPATH)).click();
		
		WebElement searchbox = driver.findElement(By.xpath(SEARCHBOX_XPATH));
		searchbox.sendKeys("testiranje");
		searchbox.submit();
		
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
		try {
			FileUtils.copyFile(scrFile, new File("C:/Users/PC/Desktop/ITbootcamp"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		driver.manage().window().setSize(pocetnaVelicina);
		
		driver.close();
		
	

	}
	
	
}
