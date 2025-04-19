package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	WebDriver driver;

	public Dashboardpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Invoices']")
	WebElement invoicesTab;

	@FindBy(xpath = "//span[text()='Share account details']")
	WebElement Shareaccountdetailsbutton;

	@FindBy(xpath = "//div[text()='Invoices']")
	WebElement invoiceverificationText;

	@FindBy(xpath = "//span[text()='Payments']")
	WebElement PaymentsTab;

	@FindBy(xpath = "//div[text()='Payments']")
	WebElement paymentverificationText;

	@FindBy(xpath = "//span[text()='Card']")
	WebElement cardTab;

	@FindBy(xpath = "//h2[text()='Available soon']")
	WebElement cardavailablesoonverificationtext;

	@FindBy(xpath = "//span[text()='Plan']")
	WebElement planTab;

	@FindBy(xpath = "//div[text()='YUZE LITE']")
	WebElement yuzeliteverificationtext;

	@FindBy(xpath = "//span[text()='Settings']")
	WebElement SettingsTab;

	@FindBy(xpath = "//div[text()='Settings']")
	WebElement settingsverificationtext;
	
	@FindBy(xpath="//input[@placeholder='username@example.com']")
	WebElement accountdetailssendviaemail;
	
	
	

	public void clickinvoicesTab() {
		invoicesTab.click();
	}

	public void clickshareaccountdetails() {
		Shareaccountdetailsbutton.click();
	}

	public boolean clickinvoiceverificationtext() {
		return invoiceverificationText.isDisplayed();
	}

	public void ClickPaymentsTab() {
		PaymentsTab.click();
	}

	public boolean clickpaymentsverificationtext() {
		return paymentverificationText.isDisplayed();

	}

	public void ClickCardTab() {
		cardTab.click();
	}

	public boolean Clickcardverificationtext() {
		return cardavailablesoonverificationtext.isDisplayed();
	}

	public void ClickPlanTab() {
		planTab.click();
	}

	public boolean clickyuzeliteverificationtext() {
		return yuzeliteverificationtext.isDisplayed();
	}

	public void clickSettingsTab() {
		SettingsTab.click();
	}

	public void clicksettingsverificationtext() {
		settingsverificationtext.isDisplayed();
	}
	
	public void entersendemailaccountdetails(String uname) {
		accountdetailssendviaemail.sendKeys(uname);
	}
}