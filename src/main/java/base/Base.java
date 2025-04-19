package base;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;

	// Initialize the WebDriver based on the browser type
	public void testInitialize(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("internetexplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			throw new Exception("INVALID BROWSER: " + browser);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	// Launch the browser before each test
	@BeforeMethod
	public void browserLaunch() throws Exception {
		testInitialize("chrome");
		driver.get("https://access-preprod.yuze.money/login");
	}

	// Close the browser and take a screenshot if the test fails
	@AfterMethod
	public void browserClose(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File screenshot = takeScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("./Screenshots/" + result.getName() + ".png"));
		}
		if (driver != null) {
		//	driver.quit();
		}
	}
}
