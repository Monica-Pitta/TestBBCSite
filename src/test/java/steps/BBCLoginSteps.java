package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Base.BaseUtil;
import pages.LoginPage;

public class BBCLoginSteps {

	BaseUtil basePage = new BaseUtil();
	LoginPage loginPage = new LoginPage();

	@Given("^User launches BBC homepage$")
	public void userLaunchBBCHomepage() {
		loginPage.launchBrowser("https://www.bbc.co.uk/");
	}

	@Then("^User clicks on Sign-in$")
	public void userClicksOnSignIn() {
		loginPage.clickSignIn();
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userEntersTheAnd(String userEmail, String userPassword) {
		loginPage.setUsername(userEmail);
		loginPage.setPassword(userPassword);
	}

	@And("^Clicks on the Sign-in button$")
	public void clicksOnTheSignInButton() {
		loginPage.clickSignInButton();
	}

	@Then("^BBC homepage should be displayed with Your account text$")
	public void bbcHomepageShouldBeDisplayedWithYourAccountText() {
		loginPage.getYourAccountText();
		basePage.close();
		basePage.quit();
	}

}
