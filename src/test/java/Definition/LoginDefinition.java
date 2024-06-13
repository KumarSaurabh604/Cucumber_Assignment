package Definition;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import tests.BaseTest;

public class LoginDefinition extends BaseTest {
	LoginPage loginpage = null;
	
	@Before
	public void setup() {
		BaseTest.intializeDriver();
		
	}
	
	@After
	public void CloseBrowser() {
		BaseTest.closeBrowser();
	}

	@Given("^Open browser$")
	public void open_browser(){
		BaseTest.openBrowser();
		
	}

	@Then("^Click on signin button$")
	public void click_on_signin_button() {
		loginpage = new LoginPage(driver);
		loginpage.ClickOnSignInButton();
	 
	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String userid, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage.EnterUserCredentials(userid, password);
	  
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() {
		loginpage.ClickOnSubmitBtn();
	  
	}
	
}
