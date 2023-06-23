package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;

public class TestPage {
	WebDriver driver = DriverFactory.getdriver();
	// Locators


	public TestPage() {
		PageFactory.initElements(driver, this);
	}

	public void getURL(String url) {
		driver.get(url);

	}

	public String getTitle() {
		return driver.getCurrentUrl();
	}

	
}
