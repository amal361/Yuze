package test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.Base;
import pages.Dashboardpage;
import pages.LoginPage;
import pages.Paymentspage;
import pages.YuzeTransferAmountPage;
import pages.YuzeTransferAmountconfirmdetailspage;
import pages.YuzeTransferPage;

public class YuzeTransferAmountconfirmdetailsTest extends Base {
	LoginPage loginpage;
	Dashboardpage dashboardpage;
	Paymentspage paymentspage;
	YuzeTransferPage yuzetransferpage;
	YuzeTransferAmountPage yuzetransferamountpage;
	YuzeTransferAmountconfirmdetailspage yuzeTransferamountconfirmdetailspage;

	@Test(enabled = false)
	public void verifyyuzepayment() throws InterruptedException {
		// Initialize LoginPage
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		dashboardpage = new Dashboardpage(driver);
		WebElement paymentsTab = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Payments']")));
		paymentsTab.click();

		paymentspage = new Paymentspage(driver);
		yuzetransferpage = new YuzeTransferPage(driver);
		WebElement createTransferButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type, 'button')])[5]")));
		createTransferButton.click();

		yuzetransferamountpage = new YuzeTransferAmountPage(driver);
		WebElement yuzetransferAmount = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='0.00']")));

		// Scroll to the transfer amount input field
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yuzetransferAmount);
		yuzetransferAmount.sendKeys("10");
		
		
		
		yuzetransferamountpage.enterYuzetransfernote("TestAmount");
		yuzetransferamountpage.clickyuzesavebutton();
	
		
		yuzeTransferamountconfirmdetailspage = new YuzeTransferAmountconfirmdetailspage(driver);
		//Scroll down to the save button before clicking
				WebElement saveButton = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Transfer now']")));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		
				Thread.sleep(15000);
		//yuzeTransferamountconfirmdetailspage.entersmscodefield("123456");
		yuzeTransferamountconfirmdetailspage.clickyuzetransfernow();
		
			
	}
	@Test(enabled = true)
	public void verifyyuzepaymentdropdownselection() throws InterruptedException {
		// Initialize LoginPage
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("amalkhan8606@gmail.com");
		loginpage.enterPassword("Aufy@123");
		loginpage.clickLoginButton();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		dashboardpage = new Dashboardpage(driver);
		WebElement paymentsTab = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Payments']")));
		paymentsTab.click();

		paymentspage = new Paymentspage(driver);
		yuzetransferpage = new YuzeTransferPage(driver);
		WebElement createTransferButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type, 'button')])[5]")));
		createTransferButton.click();

		yuzetransferamountpage = new YuzeTransferAmountPage(driver);
		WebElement yuzetransferAmount = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='0.00']")));
		
		// Scroll to the transfer amount input field
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yuzetransferAmount);
		yuzetransferAmount.sendKeys("10");
		
		yuzetransferamountpage.enterYuzetransfernote("TestAmount");
		
		//yuzetransferamountpage.clickyuzesavebutton();

	}
}	
