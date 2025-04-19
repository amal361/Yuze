package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YuzeTransferHomepage {

	WebDriver driver;

	public YuzeTransferHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}

