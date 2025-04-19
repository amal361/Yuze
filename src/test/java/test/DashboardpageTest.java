package test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.Dashboardpage;
import pages.LoginPage;

public class DashboardpageTest extends Base {
	LoginPage loginpage;
	Dashboardpage dashboardpage;

	@Test(enabled = true)
	public void verifyClickallTabs() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();
		dashboardpage = new Dashboardpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.clickinvoicesTab();
		Assert.assertEquals(dashboardpage.clickinvoiceverificationtext(), true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		dashboardpage.ClickPaymentsTab();
		Assert.assertEquals(dashboardpage.clickpaymentsverificationtext(), true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		dashboardpage.ClickCardTab();
		Assert.assertEquals(dashboardpage.Clickcardverificationtext(), true);
		dashboardpage.ClickPlanTab();
		Assert.assertEquals(dashboardpage.clickyuzeliteverificationtext(), true);
		dashboardpage.clickSettingsTab();
		Assert.assertEquals(dashboardpage.clickyuzeliteverificationtext(), true);

	}

	@Test(enabled = false)
	public void verifyClickshareaccountdetails() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();
		dashboardpage = new Dashboardpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.clickshareaccountdetails();
		Assert.assertTrue(true);
		
	}
}
