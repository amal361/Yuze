package test;

import java.time.Duration;


import org.testng.annotations.Test;

import base.Base;
import pages.Dashboardpage;
import pages.LoginPage;
import pages.Paymentspage;

public class PaymentsTest extends Base {

	LoginPage loginpage;
	Dashboardpage dashboardpage;
	Paymentspage paymentspage;

	@Test(enabled = true)
	public void verifyClicknewBeneficiaryButton() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();
		dashboardpage = new Dashboardpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.ClickPaymentsTab();
		paymentspage = new Paymentspage(driver);
		paymentspage.clicknewBeneficiaryButton();
		paymentspage.clickYuzeTransferButton();
	
	
}
}