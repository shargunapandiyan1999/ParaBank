package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By txtUSername = By.name("username");
	private By txtPassword = By.name("password");
	private By btnLogin = By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txtUSername).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void cliclLogin() {
		driver.findElement(btnLogin).click();
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		cliclLogin();
	}

	
}
