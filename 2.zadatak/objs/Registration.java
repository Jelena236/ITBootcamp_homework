package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class Registration {

	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(Constants.USERNAME_XPATH)).sendKeys(username);
	}

	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.name(Constants.PASSWORD_NAME)).sendKeys(password);
	}

	public static void inputConfirmPass(WebDriver driver, String confirmPass) {
		driver.findElement(By.name(Constants.CONFIRMPASS_NAME)).sendKeys(confirmPass);
	}
	
	public static void sumbit(WebDriver driver) {
		driver.findElement(By.name(Constants.SUBMITBTN_NAME)).click();
	}
}