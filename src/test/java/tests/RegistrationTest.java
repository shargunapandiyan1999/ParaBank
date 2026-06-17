package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.RandomDataUtil;
import utilities.TestContext;

public class RegistrationTest extends BaseTest {

	@Test
	public void registerAndLoginTest() {

		RegistrationPage registrationPage = new RegistrationPage(driver);

		registrationPage.clickRegisterLink();

		String username = RandomDataUtil.generateUsername();

		String password = "Test@123";

		TestContext.setUsername(username);
		TestContext.setPassword(password);

		registrationPage.registerUser(username, password);

		String successMsg = registrationPage.getSuccessMessage();

		Assert.assertTrue(successMsg.contains("Welcome"));
		System.out.println("Registration Successful");

		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login(TestContext.getUsername(), TestContext.getPassword());
		
		HomePage homePage = new HomePage(driver);
		
		Assert.assertTrue(homePage.isLogoutDisplayed());
		System.out.println("Login Successful");
		
		homePage.logout();
		
		System.out.println("Logout Successful");
		
	}

}
