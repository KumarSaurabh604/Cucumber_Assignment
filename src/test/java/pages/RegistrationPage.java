package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(how = How.XPATH,using = "//a[contains(text(),'Sign in')]")
	public WebElement signin;
	
	@FindBy(how = How.ID,using = "email_create")
	public WebElement email;
	
	@FindBy(how = How.ID,using = "SubmitCreate")
	public WebElement createButton;
	
	@FindBy(how = How.ID,using = "id_gender1")
	public WebElement radiobtn;
	
	@FindBy(how = How.ID,using = "customer_firstname")
	public WebElement CFname;
	
	@FindBy(how = How.ID,using = "customer_lastname")
	public WebElement CLname;
	
	@FindBy(how = How.ID,using = "passwd")
	public WebElement Password;
	
	@FindBy(how = How.ID,using = "firstname")
	public WebElement Fname;
	
	@FindBy(how = How.ID,using = "lastname")
	public WebElement Lname;
	
	@FindBy(how = How.ID,using = "phone_mobile")
	public WebElement phone;
	
	@FindBy(how = How.ID,using = "address1")
	public WebElement Address;
	
	@FindBy(how = How.ID,using = "city")
	public WebElement City;
	
	@FindBy(how = How.ID,using = "postcode")
	public WebElement Zip;
	
	@FindBy(how = How.ID,using = "id_country")
	public WebElement country;
	
	@FindBy(how = How.ID,using = "id_state")
	public WebElement State;
	
	@FindBy(how = How.ID,using = "submitAccount")
	public WebElement Register;
	
	
	public void SignIn() {
		signin.click();
	}
	
	public void email(String em) {
		email.sendKeys(em);
	}
	
	public void create() {
		createButton.click();
	}

	public void register(String cfname,String clname,String password,String fname,String lname,String mobile,String address,String state,String city,String code) {
		
		radiobtn.click();
		CFname.sendKeys(cfname);
		CLname.sendKeys(clname);
		Password.sendKeys(password);
		Fname.sendKeys(fname);
		Lname.sendKeys(lname);
		phone.sendKeys(mobile);
		Address.sendKeys(address);
		City.sendKeys(city);
		Zip.sendKeys(code);
		
		Select option = new Select(country);
	    option.selectByValue("21");
	    
	    Select opt = new Select(State);
	    opt.selectByValue("9");
	    
	}
	
	public void registerbtn() {
		Register.click();
	}
	
}