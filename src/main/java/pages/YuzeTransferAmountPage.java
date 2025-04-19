package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YuzeTransferAmountPage {

	WebDriver driver;

	public YuzeTransferAmountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='0.00']")
	WebElement yuzetransferAmount;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement yuzeTransfernote;
	
	@FindBy(xpath="//button[text()='Allowances']")
	WebElement yuzeTransferReason;
	
	@FindBy(xpath="//button[text()='Allowances']")
	WebElement yuzeTransferallowancetextselected;
	
	@FindBy(xpath="//div[text()='Bonus']")
	WebElement yuzeBonusText;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement yuzesavebutton;
	
	
	
	public void enterYuzetransferAmount(String transferamount) {
		yuzetransferAmount.sendKeys(transferamount);
	}
	public void enterYuzetransfernote(String yuzenote) {
		yuzeTransfernote.sendKeys(yuzenote);
	}
	public void clickyuzesavebutton() {
		yuzesavebutton.click();
	}
	public void enterTransferreason() {
		yuzeTransferReason.click();
	}
	public void enteryuzeTransferallownacetextselected() {
		yuzeTransferallowancetextselected.click();
	}
	public void enteryuzebonusselect() {
		yuzeBonusText.click();
	}
}
