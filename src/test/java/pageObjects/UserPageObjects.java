import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserPageObjects {
	
	public WebDriver driver;
	
	public UserPageObjects(WebDriver chromedriver) {
		driver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	@FindBy(xpath="//button [contains (text(),'Delete Button')]")
	WebElement deleteButton;
	
	@FindBy(xpath="//button [contains (text(),'Main Delete Button')]")
	WebElement globaldeleteButton;
	
	@FindBy(xpath="//input[type='checkbox']")
	List<WebElement> AllCheckboxes;
	
	public void DeleteIndividualUserRecord_ConfirmYes() {
		
		deleteButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText(); // alertText will capture program name
		
		Assert.assertEquals("Program name deleted successfully", alertText);
		
	}
	
	public void DeleteIndividualUserRecord_ConfirmNo() {
		
		deleteButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		alertDialog.dismiss();
		
		Assert.assertEquals("Program name not deleted", alertText);
		
	}
	
	public void DeleteMultipleUserRecords_ConfirmYes() {
		
		int size = AllCheckboxes.size();
    
	    
	    for(int i = 0; i<size; i++) {
	        
	        AllCheckboxes.get(i).click();
	        
	    }
	    
	    globaldeleteButton.click();
	    
	    Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText(); // alertText will capture program name
		
		Assert.assertEquals("Programs deleted successfully", alertText);
	    
	}
	
	public void DeleteMultipleUserRecords_ConfirmNo() {
		
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
	
	public boolean IsInAscendingOrder(List<WebElement> elements)
	{
		LinkedList<String> fields =  new LinkedList<String>();
		
		for(int i=0;i< elements.size();i++){

		    String s = elements.get(i).getAttribute("alt");

		    fields.add(s);

		}
		
		return chkalphabetical_order(fields);
		
	}
	
	public static boolean chkalphabetical_order(LinkedList<String> names){

	    String previous = ""; // empty string

	    for (final String current: names) {
	        if (current.compareTo(previous) < 0)
	            return false;
	        previous = current;
	    }

	    return true;

	 }
	
	public String ValidateCanUserAddNewAssignment()
	{
		WebElement loggedInUser = driver.findElement(By.id("username"));
		
		if (loggedInUser.toString().toLowerCase() == "staff")
			return "success";
		else
			return "Staff only have access to add New Assignment";
	}
	
	


}