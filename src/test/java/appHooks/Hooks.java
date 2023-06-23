package appHooks;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	static Scenario scenario;

	@Before(order = 0)
	public static void before() throws Throwable {
		String browser = System.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDrivers(browser);

	}

	@After
	public static void after() {
		driverfactory.closeallDriver();
	}
}
