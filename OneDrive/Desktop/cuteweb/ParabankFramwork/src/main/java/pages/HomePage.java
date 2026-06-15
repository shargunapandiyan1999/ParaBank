package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By logoutLink = By.linkText("Log Out");
	
	public boolean isLogoutDisplayed() {
		return driver.findElement(logoutLink).isDisplayed();
	}
	
	public void logout() {
		driver.findElement(logoutLink).click();
	}

}
