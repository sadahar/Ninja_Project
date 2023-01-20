package baseClass;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectForHomePageCheckFunctionality;
import pageObject.PageObjectLoginPage;
import utility.ReadConfig;

public class BaseClass {

	public static WebDriver driver;

	public PageObjectLoginPage pageobject;
	
	public ReadConfig readconfig;
	
	public PageObjectForHomePageCheckFunctionality poforhomepage;

}
