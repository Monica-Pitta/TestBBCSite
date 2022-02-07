package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseUtil {

	public static WebDriver Driver;
	public static RemoteWebDriver driver;

	public void Initialisation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void launchUrl(String url) {
		Initialisation();
		driver.get(url);
	}

	public void actionsClickUsingXpath(String locator) {
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(locator));
		actions.moveToElement(ele).build().perform();
		ele.click();
	}

	public void actionsClickUsingID(String locator) {
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.id(locator));
		actions.moveToElement(ele).build().perform();
		ele.click();
	}

	public void actionsSendKeysUsingID(String locator, String text) {
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.id(locator));
		actions.moveToElement(ele).build().perform();
		ele.click();
		ele.sendKeys(text);
	}

	public String actionsGetTextUsingXpath(String locator) {
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(locator));
		actions.moveToElement(ele).build().perform();
		return ele.getText();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

}
