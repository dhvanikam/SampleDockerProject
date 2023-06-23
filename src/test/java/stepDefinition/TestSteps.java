package stepDefinition;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestPage;

public class TestSteps {
	TestPage page=new TestPage();
	@Given("The user is given URL")
	public void the_user_is_given_url() {
		System.out.println("Given url");
	}

	@When("The user launch the URL as {string}")
	public void the_user_launch_the_url_as(String string) {
		page.getURL(string);
	}

	@Then("The user shoul able to navigate to website URL {string}")
	public void the_user_shoul_able_to_navigate_to_website_url(String string) {
		String currenturl = page.getTitle();
		Assert.assertEquals(currenturl, "https://www.google.com/");
	}

}