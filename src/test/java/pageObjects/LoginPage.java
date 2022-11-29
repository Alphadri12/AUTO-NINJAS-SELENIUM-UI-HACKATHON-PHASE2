package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver edgedriver) {
		driver = edgedriver;
		PageFactory.initElements(edgedriver,this);
	}
			
	@FindBy(id ="User Name")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath ="//input[@value = 'Log In']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText ="Forgot Password")
	@CacheLookup
	WebElement txtForgotpwd;
	
	@FindBy(linkText = "Log in")
	WebElement buttonLogin;
	
	@FindBy(id = "code")
	WebElement txtcode;
	
	@FindBy(xpath ="//div[@class = 'alert-primary']")
	WebElement txterrormsg;
	
	@FindBy(id = "email")
	WebElement txtemail;
	
	@FindBy(id = "continue")
	WebElement btncontinue;
	
	@FindBy(className = "verification-code")
	WebElement vcode;
	
	@FindBy(partialLinkText = "Click here")
	WebElement resend;
	
	public void resendCode() {
		resend.click();
	}
	
	public void verificationCode() {
		vcode.sendKeys("12345");
	}
	
	public void hitcontinue() {
		btncontinue.click();
	}
	public void enterEmail() {
		txtemail.sendKeys("giraffes@gmail.com");
	}
	public void errormsg() {
		txterrormsg.isDisplayed();
	}
			
	public void enterCode(String code) {
		txtcode.sendKeys();
    }
	
	public void hitLogin() {
		buttonLogin.click();
	}
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	
    public void resetPassword() {
    	txtForgotpwd.click();
    }
    
    @FindBy(xpath ="//div[@class = 'cancel']")
    WebElement btnCancel;
    
    public void Cancel() {
    	btnCancel.click();
    }
    
    @FindBy(id = "retype-password")
    WebElement txtRetype;
    
    public void reType() {
    	txtRetype.sendKeys("Password@22");
    }
}
