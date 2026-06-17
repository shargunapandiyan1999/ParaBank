package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchTest extends BaseTest {

	@Test
	public void verifyApplicationLaunch() {
		System.out.println("Test Started");

		String title = driver.getTitle();

		System.out.println(title);

		Assert.assertTrue(title.contains("ParaBank"));
	}

}
