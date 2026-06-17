package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	private By registerLink = By.linkText("Register");
	private By firstName = By.id("customer.firstName");
	private By lastName = By.id("customer.lastName");
	private By address = By.id("customer.address.street");
	private By city = By.id("customer.address.city");
	private By state = By.id("customer.address.state");
	private By zipCode = By.id("customer.address.zipCode");
	private By phone = By.id("customer.phoneNumber");
	private By ssn = By.id("customer.ssn");
	private By userName = By.id("customer.username");
	private By password = By.id("customer.password");
	private By confirmPassword = By.id("repeatedPassword");
	private By RegisterBtn = By.xpath("//input[@value='Register']");
	private By successMsg = By.xpath("//h1[@contains(text(), 'Welcome']");

	public void clickRegisterLink() {
		driver.findElement(registerLink).click();
	}

	public void enterFirstName(String value) {
		driver.findElement(firstName).sendKeys(value);
	}

	public void enterLastName(String value) {
		driver.findElement(lastName).sendKeys(value);
	}

	public void enterAddress(String value) {
		driver.findElement(address).sendKeys(value);
	}

	public void enterCity(String value) {
		driver.findElement(city).sendKeys(value);
	}

	public void enterState(String value) {
		driver.findElement(state).sendKeys(value);
	}

	public void enterZipCode(String value) {
		driver.findElement(zipCode).sendKeys(value);
	}

	public void enterPhone(String value) {
		driver.findElement(phone).sendKeys(value);
	}

	public void enterSsn(String value) {
		driver.findElement(ssn).sendKeys(value);
	}

	public void enterUsername(String value) {
		driver.findElement(userName).sendKeys(value);
	}

	public void enterPassword(String value) {
		driver.findElement(password).sendKeys(value);
	}

	public void enterConfirmPassword(String value) {
		driver.findElement(confirmPassword).sendKeys(value);
	}

	public void clickRegisterButton() {
		driver.findElement(RegisterBtn).click();

	}

	public String getSuccessMessage() {
		return driver.findElement(successMsg).getText();
	}

	public void registerUser(String user, String pass) {
		enterFirstName("Pandi");
		enterLastName("Tester");
		enterAddress("11/87, padapai");
		enterCity("Chennai");
		enterState("TamilNadu");
		enterZipCode("601301");
		enterPhone("9876543210");
		enterSsn("123");

		enterUsername(user);
		enterPassword(pass);
		enterConfirmPassword(pass);

		clickRegisterButton();

	}
}
