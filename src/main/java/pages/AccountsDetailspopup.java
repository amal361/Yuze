package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsDetailspopup {

	WebDriver driver;

	public AccountsDetailspopup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='username@example.com']")
	WebElement sendviaEmailUsername;
	@FindBy(xpath = "//button[@class='p-element p-button p-component']")
	WebElement accountsDetailssendbutton;
	
	
	
	public void entersendviaEmailUseremail(String uname) {
		sendviaEmailUsername.sendKeys(uname);
		
	}
	public void accountsDetailssendbutton() {
		accountsDetailssendbutton.click();
	}
	
}
