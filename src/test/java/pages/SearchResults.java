package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseUtil;
import org.junit.Assert;

public class SearchResults extends BaseUtil {

	public void launchBrowser(String url) {
		launchUrl(url);
	}

	public void clickSearch() {
		actionsClickUsingXpath("//span[@class='ssrcss-1hhm2vt-SearchText eki2hvo2'");
	}

	public void sendText(String text) {
		actionsSendKeysUsingID("\"search-input\"", text);
	}

	public void clickSearchIcon() {
		actionsClickUsingXpath("//span[@data-testid='actions:search']//*[name()='svg']");
	}

	public void verifySearchResults() {
		List<WebElement> ele = driver.findElements(By.xpath("//a[contains(@class, 'ssrcss-atl1po-PromoLink')]"));
		int count = ele.size();
		Assert.assertEquals(count, 10);
	}

}
