package pages;

import org.junit.Assert;
import Base.BaseUtil;

public class LoginPage extends BaseUtil {

	public void launchBrowser(String url) {
		launchUrl(url);
	}

	public void clickSignIn() {
		actionsClickUsingXpath("//*[@class='ssrcss-qgttmg-AccountText eki2hvo4']");
	}

	public void setUsername(String username) {
		actionsSendKeysUsingID("user-identifier-input", username);
	}

	public void setPassword(String text) {
		actionsSendKeysUsingID("password-input", text);
	}

	public void clickSignInButton() {
		actionsClickUsingID("submit-button");
	}

	public void getYourAccountText() {
		Assert.assertTrue(actionsGetTextUsingXpath("//span[text()='Your account']").equals("Your account"));
	}

}