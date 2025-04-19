package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentspage {

	
	WebDriver driver;

	public Paymentspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@type='button']")
	WebElement newBeneficiaryButton;
	
	@FindBy(xpath ="//button[@role='menuitem'][2]")
	WebElement yuzeTransferButton;
	
	
	
	public void clicknewBeneficiaryButton() {
		newBeneficiaryButton.click();
	}
	
	public void clickYuzeTransferButton() {
		yuzeTransferButton.click();
	}
}
