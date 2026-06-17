package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverFactory;
import utilities.ConfigReader;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.initDriver();
		driver.get(ConfigReader.getProperty("url"));
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
