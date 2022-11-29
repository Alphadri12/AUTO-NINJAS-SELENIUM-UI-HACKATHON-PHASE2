package pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BatchPageObjects {
	
public WebDriver driver;
	
	public BatchPageObjects(WebDriver chromedriver) {
		driver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	@FindBy(xpath="//button [contains (text(),'Delete Button')]")
	WebElement deleteButton;
	
	@FindBy(xpath="//button [contains (text(),'Main Delete Button')]")
	WebElement globaldeleteButton;
	
	@FindBy(xpath="//input[type='checkbox']")
	List<WebElement> AllCheckboxes;
	
	public void DeleteIndividualRecord_ConfirmYes() {
		
		deleteButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText(); // alertText will capture program name
		
		Assert.assertEquals("Program name deleted successfully", alertText);
		
	}
	
	public void DeleteIndividualRecord_ConfirmNo() {
		
		deleteButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		alertDialog.dismiss();
		
		Assert.assertEquals("Program name not deleted", alertText);
		
	}
	
	public void DeleteMultipleRecords_ConfirmYes() {
		
		int size = AllCheckboxes.size();
    
	    
	    for(int i = 0; i<size; i++) {
	        
	        AllCheckboxes.get(i).click();
	        
	    }
	    
	    globaldeleteButton.click();
	    
	    Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText(); // alertText will capture program name
		
		Assert.assertEquals("Programs deleted successfully", alertText);
	    
	}
	
	public void DeleteMultipleRecords_ConfirmNo() {
		
		int size = AllCheckboxes.size();
    
	    
	    for(int i = 0; i<size; i++) {
	        
	        AllCheckboxes.get(i).click();
	        
	    }
	    
	    globaldeleteButton.click();
	    
	    Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		alertDialog.dismiss();
		
		Assert.assertEquals("Program name not deleted", alertText);
	    
	}
}
