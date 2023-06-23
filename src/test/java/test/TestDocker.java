package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDocker {
	public static void main(String[] args) throws MalformedURLException {

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
//		options.addArguments("start-maximized"); // open Browser in maximized mode
//		options.addArguments("disable-infobars"); // disabling infobars
//		options.addArguments("--disable-extensions"); // disabling extensions
//		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		//options.addArguments("--no-sandbox"); // Bypass OS s
	
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
		
//		FirefoxBinary firefoxBinary = new FirefoxBinary();
//		firefoxBinary.addCommandLineOptions("--headless");
//		FirefoxOptions options = new FirefoxOptions();
//		options.setBinary(firefoxBinary);
//		WebDriverManager.firefoxdriver().setup();
//		
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
//		//driver = new FirefoxDriver(options);
//		options.setBinary(firefoxBinary);
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
