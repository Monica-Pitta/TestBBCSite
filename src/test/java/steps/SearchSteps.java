package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResults;

public class SearchSteps extends BaseUtil {

	BaseUtil basePage = new BaseUtil();
	SearchResults searchfunction = new SearchResults();

	@Given("I open BBC website using chrome browser")
	public void i_open_BBC_website_using_chrome_browser() {

		searchfunction.launchBrowser("https://www.bbc.co.uk/");

	}

	@When("I click on search option")
	public void i_click_on_search_option() {

		searchfunction.clickSearch();

	}

	@And("I enter \\\"([^\\\"]*)\\\" in search textbox")
	public void i_enter_in_search_textbox(String text) {

		searchfunction.sendText(text);

	}

	@And("I click at Search button")
	public void i_click_at_search_button() {

		searchfunction.clickSearchIcon();
	}

	@Then("search results are displayed")
	public void search_results_are_displayed() {
		searchfunction.verifySearchResults();

	}
}
