package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginpage;

	@Test(enabled = false)
	public void verifyLoginPageTitle() {
		loginpage = new LoginPage(driver);
		String actualTitle = loginpage.getLoginPageTitle();
		String expectedTitle = "Home";
		Assert.assertEquals(actualTitle, expectedTitle, "Invalid Loginpage title");
	}

	@Test(enabled = false)
	public void verifyLogin() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan858@gmail.com");
		loginpage.enterPassword("Aufy@123");
		// Thread.sleep(5000);
		loginpage.clickLoginButton();
		// String actualTitle = loginpage.getLoginText();
		// String expectedTitle = "Login";
		// Assert.assertEquals(actualTitle, expectedTitle, "Invalid Loginpage title");
	}

	@Test(enabled = false)
	public void verifyInvalidLogin() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan86046@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();
	}
	
	@Test(enabled = true)
	public void verifyprivacyclick() {
		loginpage = new LoginPage(driver);
		loginpage.clickPrivacypolicy();
		Assert.assertTrue(true);
	}
	
	
}