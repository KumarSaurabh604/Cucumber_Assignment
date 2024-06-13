package Definition;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.RegistrationPage;
import tests.BaseTest;

public class RgeisterDefinition extends BaseTest{
	RegistrationPage register = null;
	
//	@Before
//	public void setup() {
//		BaseTest.intializeDriver();
//	}
//	
//	@After
//	public void CloseBrowser() {
//		BaseTest.closeBrowser();
//	}
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	   BaseTest.openBrowser();
	}

	@Then("^click on signin button$")
	public void click_on_signin_button() throws Throwable {

		register = new RegistrationPage(driver);
		register.SignIn();
	}

	@Then("^enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
		register.email(arg1);
	}

	@Then("^click create button$")
	public void click_create_button() throws Throwable {
	  
		register.create();
	}

	@Then("^Fill \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_and_and_and_and_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.register(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9,arg10);
	}

	@Then("^Click submit Button$")
	public void click_submit_Button() throws Throwable {
	   register.registerbtn();
	}


}
