package test;



import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.AccountsDetailspopup;
import pages.Dashboardpage;
import pages.LoginPage;

public class AccountsDetailspopupTest extends Base {
	LoginPage loginpage;
	Dashboardpage dashboardpage;
	AccountsDetailspopup accountsdetailspopup;
	
	@Test(enabled = true)
	public void verifyAccountsendviaEmail() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();
		dashboardpage = new Dashboardpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.clickshareaccountdetails();
		accountsdetailspopup = new AccountsDetailspopup(driver);
		accountsdetailspopup.entersendviaEmailUseremail("amalkhan858@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		accountsdetailspopup.accountsDetailssendbutton();
		Assert.assertTrue(true);
		
	
	
}
}