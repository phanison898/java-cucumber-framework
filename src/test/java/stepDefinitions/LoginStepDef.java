package stepDefinitions;

import com.pageObjects.FeedPage;
import com.pageObjects.LoginPage;
import com.util.ENV;
import com.util.Util;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends Util {

	LoginPage loginPage;
	FeedPage feedPage;

	@Before
	public void before() {
		launchBrowser();
	}

	@After
	public void after() {
		quitBrowser();
	}

	@Given("User launched the website already by using url {string} in chrome browser")
	public void launchTheWebsiteURL(String string) {
		loginPage = new LoginPage();
		launchWebsite(string);
	}

	@Given("User enters username as {string} and password as {string}")
	public void enterUsernameAndPassword(String string, String string2) {
		loginPage.enterCredentials(ENV.get("EMAIL"), ENV.get("PASSWORD"));
	}

	@When("User clicks login button")
	public void clickSignInButton() {
		feedPage = loginPage.clickSignInButton();
	}

	@Then("User should navigate to main feed page with title as {string}")
	public void validateFeedPageTitle(String title) {
		String expected = title;
		String actual = getTitle();
		Assert.isTrue(actual.contains(expected), "Title didn't match | Actual [%s] | Expected [%s]", actual, expected);
	}

	@Then("Username should be displayed correctly")
	public void validateUsername() {
		String expected = ENV.get("NAME");
		String actual = feedPage.getUsername();
		Assert.isTrue(actual.contains(expected), "Username didn't match | Actual [%s] | Expected [%s]", actual,
				expected);

	}

}
