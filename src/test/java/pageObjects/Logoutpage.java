package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
public WebDriver driver;
	
	public Logoutpage(WebDriver edgedriver) {
		driver = edgedriver;
		PageFactory.initElements(edgedriver,this);
	}
    @FindBy(id = "Manage Batch")
    WebElement txtTitle;
    
    public void verifyTitle() {
    	txtTitle.isDisplayed();
    	System.out.println("Title is displayed: " +txtTitle);
    }
    
    @FindBy(id = "Logout")
    WebElement btnLogout;
    
    public void LogOut() {
    	btnLogout.click();
    }
    
    @FindBy(className = "Login")
    WebElement txtLogin;
    
    public void headerLogin(String text) {
    	Assert.assertEquals(text, driver.getTitle());
    }

}
