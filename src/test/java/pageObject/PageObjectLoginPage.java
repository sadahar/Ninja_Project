package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectLoginPage {

	public PageObjectLoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Email;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement LoginButton;

	public void EMAIL(String ml) {
		Email.sendKeys(ml);
	}

	public void PASSWORD(String pass) {
		Password.sendKeys(pass);
	}

	public void LOGIN_BUTTON() {
		LoginButton.click();
	}
}
