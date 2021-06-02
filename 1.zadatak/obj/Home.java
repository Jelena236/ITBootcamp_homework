package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

public static final String URL = "https://itbootcamp.rs/";

	
	public static void clickNasaPrica(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"menu-item-5519\"]/a")).click();
	}
}
