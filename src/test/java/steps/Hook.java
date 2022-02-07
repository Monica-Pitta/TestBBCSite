package steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseUtil {

	@Before
	public void InitializeTest(Scenario scenario) {
		//Initialisation();
	}

	@After
	public void closeDriver() {
		driver.quit();
	}

}
