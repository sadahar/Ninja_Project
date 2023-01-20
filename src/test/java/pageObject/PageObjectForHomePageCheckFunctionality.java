package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectForHomePageCheckFunctionality {

	public PageObjectForHomePageCheckFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()='My Account'])[2]")
	private WebElement myaccount;
	@FindBy(xpath = "//a[text()='Edit Account']")
	private WebElement editaccount;
	@FindBy(xpath = "//a[text()='Password']")
	private WebElement password;

	// 

	public void My_Account() {
		myaccount.click();;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Edit_Account() {
		editaccount.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Password() {
		password.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
