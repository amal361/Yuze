package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YuzeTransferPage {
	WebDriver driver;

	public YuzeTransferPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[text()='New Beneficiary']")
	WebElement yuzeTransfernewbeneficiaryverificationtext;
	
	@FindBy(xpath="//textarea[@rows='1']")
	WebElement yuzeaccountTitle;
	
	@FindBy(xpath="//input[@class='input'][1]")
	WebElement yuzenickname;
	
	@FindBy(xpath="(//input[contains(@class, 'input')])[2]")
	WebElement yuzeaccountnumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement yuzesavebutton;
	
	@FindBy(xpath="(//button[contains(@type, 'button')])[3]")
	WebElement createyuzetransferbuttonclick;
	

	public boolean yuzenewbeneficiarytext() {
		return yuzeTransfernewbeneficiaryverificationtext.isDisplayed();
	}
	public void enterYuzeaccountTitle(String accnttitleuname) {
		yuzeaccountTitle.sendKeys(accnttitleuname);
	}
	
	public void enterYuzenickname(String nick) {
		yuzenickname.sendKeys(nick);
	}
	public void enteryuzeaccountnumber(String accntnumber) {
		yuzeaccountnumber.sendKeys(accntnumber);
	}
	public void clickyuzesavebutton() {
		yuzesavebutton.click();
	}
	public void createyuzetransfer() {
		createyuzetransferbuttonclick.click();
	}
	
}