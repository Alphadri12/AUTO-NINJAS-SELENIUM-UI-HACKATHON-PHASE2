package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	public WebDriver driver;
	public UserPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//div[@role='dialog'])[1]")
	WebElement placeholder;
	
	@FindBy(xpath="//div[contains(text(),'UG Program')]")
	WebElement ugprogram;
	
	@FindBy(xpath="//button[@label='Add New User']")
	WebElement addnewuser;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper'][1]")
	WebElement stateDropdownArrow;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper'][2]")
	WebElement userroleDropdownArrow;
	
	@FindBy(xpath="//tag[@class=submit")
	WebElement submitBtn;
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="cityName")
	WebElement cityName;
	
	@FindBy(id="programName")
	WebElement programName;
	
	@FindBy(xpath="//label[contains(text(),'Email')]")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Phone no']")
	WebElement phoneno;
	
	@FindBy(xpath="//label[contains(text(),'zip code]")
	WebElement zipcode;
	
	
	
	
	
	
	
	public void placeholderEntireDisplay() {
		placeholder.isDisplayed();
		
	}
	public void addNewUserbtnClk() {
		
		addnewuser.click();
	}
	public void stateDropdownBxArrow(){
		
		stateDropdownArrow.click();
		
	}
	public void userRoleDropdownBxArrow(){
		
		userroleDropdownArrow.click();
		
	}
	public void submitBtn() {
		
		placeholder.clear(); /*To clear all the entries in the assignment form and then clicking the btn*/
		submitBtn.click();
	}
	public void fieldValidation(String fn,String ln,String cn,String pn) {
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		cityName.sendKeys(cn);
		programName.sendKeys(pn);
	}
	public void emailValidation(String em) {
		
		email.sendKeys(em);
	}
	public void phoneNoValidation(String num) {
	
	phoneno.sendKeys(num);
	}
	public void zipCodeValidation(String zc) {
		
		zipcode.sendKeys(zc);
	}
	public void ugProgramDisplay() {
		
		ugprogram.isDisplayed();
	}

			
	


}
