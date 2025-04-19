package test;



import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.Dashboardpage;
import pages.LoginPage;
import pages.Paymentspage;
import pages.YuzeTransferPage;

public class YuzeTransferpageTest extends Base {
	LoginPage loginpage;
	Dashboardpage dashboardpage;
	Paymentspage paymentspage;
	YuzeTransferPage yuzetransferpage;

	@Test(enabled = false)
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
		yuzetransferpage = new YuzeTransferPage(driver);
		Assert.assertEquals(yuzetransferpage.yuzenewbeneficiarytext(), true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		yuzetransferpage.enterYuzeaccountTitle("TestData");
		yuzetransferpage.enterYuzenickname("Test");
		yuzetransferpage.enteryuzeaccountnumber("1233");
		yuzetransferpage.clickyuzesavebutton();
	}
	
	@Test(enabled = true)
	public void verifyClickcreateyuzetransfer() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();
		dashboardpage = new Dashboardpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.ClickPaymentsTab();
		paymentspage = new Paymentspage(driver);
		yuzetransferpage = new YuzeTransferPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		yuzetransferpage.createyuzetransfer();
}
}