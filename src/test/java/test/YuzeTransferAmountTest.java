package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Base;
import pages.Dashboardpage;
import pages.LoginPage;
import pages.Paymentspage;
import pages.YuzeTransferAmountPage;
import pages.YuzeTransferPage;

public class YuzeTransferAmountTest extends Base{
	LoginPage loginpage;
	Dashboardpage dashboardpage;
	Paymentspage paymentspage;
	YuzeTransferPage yuzetransferpage;
	YuzeTransferAmountPage yuzetransferamountpage;

	@Test(enabled = true)
	public void verifyClickNewBeneficiaryButton() throws InterruptedException {
	    // Initialize LoginPage
	    loginpage = new LoginPage(driver);
	    loginpage.enterUserName("amalkhan8606@gmail.com");
	    loginpage.enterPassword("Aufy@123");
	    loginpage.clickLoginButton();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    dashboardpage = new Dashboardpage(driver);
	    WebElement paymentsTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Payments']")));
	    paymentsTab.click();
	    paymentspage = new Paymentspage(driver);
	    yuzetransferpage = new YuzeTransferPage(driver);
	    WebElement createTransferButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type, 'button')])[3]")));
	    createTransferButton.click();
	    yuzetransferamountpage = new YuzeTransferAmountPage(driver);
	    WebElement yuzetransferAmount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='0.00']")));
	    yuzetransferAmount.sendKeys("100");
	    Thread.sleep(8000);
	    yuzetransferamountpage.enteryuzeTransferallownacetextselected();
	    Thread.sleep(4000);
	    

	    yuzetransferamountpage.enteryuzebonusselect();
	  
	    yuzetransferamountpage.enterYuzetransfernote("TestAmount");
	    //yuzetransferamountpage.clickyuzesavebutton();

	    
	}

}