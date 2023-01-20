package stepDefination;

import org.junit.After;

import baseClass.BaseClass;

import io.cucumber.java.en.When;

public class StepDefinationForCloseBrowser extends BaseClass {
   
	@After
	@When("user close browser")
	public void user_close_browser() {

		driver.close();
		driver.quit();

	}

}
