package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='input-container input__full']//input[@placeholder='Your email']")
	WebElement loginUsername;
	@FindBy(xpath = "//div[@class='input-container input__full']//input[@placeholder='Your password']")
	WebElement loginPassword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement getLoginText;
	
	@FindBy(xpath="//a[text()='Privacy Policy'][1]")
	WebElement Privacyploicy;

	public String getLoginPageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public String getLoginText() {
		String text = getLoginText.getText();
		return text;
	}

	public void enterUserName(String uname) {
		loginUsername.sendKeys(uname);
	}

	public void enterPassword(String Pwd) {
		loginPassword.sendKeys(Pwd);
	}

	public void clickPrivacypolicy() {
		Privacyploicy.click();
	}
	public Dashboardpage clickLoginButton() {
		loginButton.click();
		return new Dashboardpage(driver);
	}

}