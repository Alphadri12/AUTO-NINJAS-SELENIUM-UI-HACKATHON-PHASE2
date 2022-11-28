package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage  {
	
	
	public WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
					
}
	@FindBy(xpath="//a[contains(text(),'Registration Form')]")
	WebElement RegisterationBtn;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement LogInBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(id="firstName")
	WebElement FirstNamebx;
	
	@FindBy(id="lastName")
	WebElement LastNamebx;
	
	@FindBy(xpath="//label[contains(text(),'address')]")
	WebElement AddBx;
	
	@FindBy(xpath="//label[contains(text(),'streetName')]")
	WebElement Streetbx;
	
	@FindBy(id="city")
	WebElement Citybx;
	
	@FindBy(xpath="//select[contains(text(),'DropDownListState')]")
	WebElement StateDropDown;
	
	@FindBy(id="zipcode")
	WebElement Zipbx;
	
	@FindBy(xpath="//input[contains(text(),'custom_date_pic required picker-first home-date-pick')]")
	WebElement BirtDate;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Usernamebx;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Passwordbx;
	
	@FindBy(id="phoneNumber")
	WebElement PhoneNobx;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Submit")
	WebElement Submitbtn;
	
	@FindBy(xpath="//a[contains(text(),'Enters all fields')]")
	WebElement emptyFields;
	
	@FindBy(xpath="//a[contains(text(),'Enters all fields')]")
	WebElement validFirstNameMsg;
	
	public void toChkVisibility() {
		RegisterationBtn.isDisplayed();
		
	}
	public void loginBtnVisibility() {
		
		LogInBtn.isDisplayed();
		LogInBtn.click();
	}
	public void signUpBtnVisibility() {
		
		SignUpBtn.isDisplayed();
		SignUpBtn.getText();
	}
	public void signUpAction() {
		SignUpBtn.click();
	}
	public void setFirstName(String fn) {
		FirstNamebx.sendKeys(fn);
		//String text=FirstNamebx.getText();
		
		
	}
	public void setLastName(String ln) {
		
		LastNamebx.sendKeys(ln);
		//String text=LastNamebx.getText();
	}
	public void setAddress(String add) {
		
		AddBx.sendKeys(add);
	}
	public void setStreetName(String sn) {
		
		Streetbx.sendKeys(sn);
	}
	
	public void setZipCode(String zc) {
		  Zipbx.sendKeys(zc);
		
		
	}
	public void setCityName(String city) {
		
		Citybx.sendKeys(city);
		
	}
	public boolean cityNameDisplay() {
		
		return Citybx.isDisplayed();
	}
	public void selectState()
	{
		StateDropDown.click();
		
	}
	public boolean selectedStateVisiblity() {
		
		return StateDropDown.isSelected();
	}
	
	public void setDateOfBirth() {
		
		BirtDate.click();
	}
	public boolean birthDateDisplay() {
		
		return BirtDate.isDisplayed();
	}
	public void setPassword(String pw) {
		
		Passwordbx.sendKeys(pw);
	}
	public boolean passwordDisplay() {
		
		return Passwordbx.isDisplayed();
	}
	public void setValidUsername(String un) {
		Usernamebx.sendKeys(un);
		
	}
	public boolean userNameVisiblity() {
		
		return Usernamebx.isDisplayed();
	}
	public void setEmail(String email) {
		
		Email.sendKeys(email);
	}
	public boolean emailDisplay() {
		return Email.isDisplayed();
		
	}
	public void ClickSubmitBtn() {
		
		Submitbtn.click();
	}
	
	public void setMobileNo(String num) {
		PhoneNobx.sendKeys(num);
		
	}
	public void validatingEmptyfieldMsg() {
		emptyFields.getText();
		
		
	}
	public void validatingFirstNameMsg() {
		validFirstNameMsg.getText();
	}
	
			
}