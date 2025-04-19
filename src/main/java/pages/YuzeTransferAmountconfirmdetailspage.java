package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YuzeTransferAmountconfirmdetailspage {
	WebDriver driver;

	public YuzeTransferAmountconfirmdetailspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//input[@name='smspass']")
	WebElement smscodeenterfield;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement yuzetransfernow;

	
	public void entersmscodefield(String uname) {
		smscodeenterfield.sendKeys(uname);
	}
	
	public YuzeTransferHomepage clickyuzetransfernow() {
		yuzetransfernow.click();
		return new YuzeTransferHomepage(driver);
	}

}