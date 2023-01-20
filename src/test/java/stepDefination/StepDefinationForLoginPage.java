package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.types.resources.comparators.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import baseClass.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObject.PageObjectForHomePageCheckFunctionality;
import pageObject.PageObjectLoginPage;
import utility.ReadConfig;

public class StepDefinationForLoginPage extends BaseClass {

	@Before
	public void set_up() {
		readconfig = new ReadConfig();
		String browser = readconfig.getbrowser();
		switch (browser.toLowerCase()) {

		case "chrome":

			System.setProperty("webdriver.edge.driver",
					"D:\\diff browser\\edgedriver_win64\\neeee\\edgedriver_win64 (3)\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		case "Medge":
			System.setProperty("webdriver.firefox.driver", "");
			driver = new FirefoxDriver();
			break;

		case "firefox":

			System.setProperty("webdriver.chrome.driver",
					"D:\\diff browser\\Chrome\\NewCatLatest\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			driver = null;
			break;

		}
	}

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		pageobject = new PageObjectLoginPage(driver);
		poforhomepage = new PageObjectForHomePageCheckFunctionality(driver);

	}

	@When("User open Url {string}")
	public void user_open_url(String url) {

		driver.get(url);

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		pageobject.EMAIL(email);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pageobject.PASSWORD(password);
	}

	@When("User Click on Login butto")
	public void user_click_on_login_butto() {
		pageobject.LOGIN_BUTTON();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) throws InterruptedException {
		String ActualTitle = driver.getTitle();
		if (expectedTitle.equals(ActualTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
	}

	@When("User click on My Account")
	public void user_click_on_my_account() {
		poforhomepage.My_Account();

	}

	@And("User Click on Edit account")
	public void user_click_on_edit_account() {
		poforhomepage.Edit_Account();
	}

	@And("user Click on Password")
	public void user_click_on_password() {
		poforhomepage.Password();

	}

	@AfterStep
	public void screenshot(Scenario sc) {
		if (sc.isFailed() == true) {
			Date d = new Date();
			String scr = d.toString();
			scr = scr.replace(" ", "_");
			scr = scr.replace(":", "-");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scrfolder = ts.getScreenshotAs(OutputType.FILE);
			File file = new File(
					"C:\\Users\\BusinessComputers.in\\eclipse-workspaceSADA\\Ninja_Cucumber_projct\\target\\Screenshot "
							+ scr + ".jpg");

			try {
				FileHandler.copy(scrfolder, file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
