package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Clientpage {
	WebDriver driver;

	public Clientpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public Clientpage data() {
		return new Clientpage(driver);
	}
}
