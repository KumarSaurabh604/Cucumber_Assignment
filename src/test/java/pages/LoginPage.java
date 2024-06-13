package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class='login']")
	public WebElement SigninBtn;
	@FindBy(how = How.ID_OR_NAME, using = "email")
	public WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public WebElement Password;
	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	public WebElement SubmitBtn;
	
	public void ClickOnSignInButton() {
		SigninBtn.click();
	}
	
	public void EnterUserCredentials(String username,String password) {
		this.Email.sendKeys(username);
		this.Password.sendKeys(password);
	}
	
	public void ClickOnSubmitBtn() {
		SubmitBtn.click();
	}
}
