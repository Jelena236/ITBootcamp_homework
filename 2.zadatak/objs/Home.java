package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class Home {
		
	public static void clickRegBtn(WebDriver driver) {
		driver.findElement(By.linkText(Constants.REGISTER_LTXT)).click();
	}

	

}
