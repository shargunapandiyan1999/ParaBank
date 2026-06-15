package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {

	@Test
	public void verifyValidLogin() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		
		HomePage homePage = new HomePage(driver);
		
		Assert.assertTrue(homePage.isLogoutDisplayed(), "Login Failed");
		
		System.out.println("Login Successfull");
		
		//Logout
		
		homePage.logout();
		
		Assert.assertTrue(
				driver.getCurrentUrl().contains("index"), "Logout Failed");
		System.out.println("Logout Successful");
	}

}
