package pageObjects;

import junit.framework.Assert;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentPageObjects {
	public WebDriver driver;
	
	public AssignmentPageObjects(WebDriver chromedriver) {
		driver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	@FindBy(linkText = "Assignment")
	WebElement lnkAssignment;
	
	@FindBy(xpath="//header[contains(text(),'Manage Assignment')]")
	WebElement headerText;
	
	@FindBy(xpath="//[contains(text(),'In total there are 3 assignment'")
	WebElement footerText;
	
	@FindBy(xpath="//button [contains (text(),'Next Button')]")
	WebElement paginatorNextButton;
	
	@FindBy(xpath="//button [contains (text(),'Prev Button')]")
	WebElement paginatorPrevButton;
	
	@FindBy(xpath="//button [contains (text(),'First Button')]")
	WebElement paginatorFirstButton;
	
	@FindBy(xpath="//button [contains (text(),'Last Button')]")
	WebElement paginatorLastButton;
	
	@FindBy(xpath="//button [contains (text(),'Edit Button')]")
	WebElement editButton;
	
	@FindBy(xpath="//button [contains (text(),'Delete Button')]")
	WebElement deleteButton;
	
	@FindBy(id="search-text')]")
	WebElement searchBox;
	
	@FindBy(id="assignment-name")
	WebElement assignmentName;
	
	@FindBy(id="assignment-description")
	WebElement assignmentDescription;
	
	@FindBy(id="assignment-duedate")
	WebElement assignmentDueDate;
	
	@FindBy(id="assignment-grade")
	WebElement assignmentGrade;
	
	@FindBy(id="assignment-details")
	WebElement assignmentDetails;
	
	@FindBy(id="assignment-details-name")
	WebElement assignmentDetailsName;
	
	@FindBy(id="assignment-details-description")
	WebElement assignmentDetailsDescription;
	
	@FindBy(id="assignment-details-grade")
	WebElement assignmentDetailsGrade;
	
	@FindBy(id="assignment-details-duedate")
	WebElement assignmentDetailsDuedate;
	
	@FindBy(id="assignment-details-save-btn")
	WebElement assignmentDetailsSaveButton;
	
	@FindBy(id="assignment-details-cancel-btn")
	WebElement assignmentDetailsCancelButton;
	
	@FindBy(id="assignment-googleform-name")
	WebElement assignmentGoogleFormName;
	
	@FindBy(id="assignment-googleform-animal")
	WebElement assignmentGoogleFormAnimal;
	
	@FindBy(id="assignment-googleform-color")
	WebElement assignmentGoogleFormColor;
	
	@FindBy(id="assignment-googleform-submit")
	WebElement assignmentGoogleFormSubmitButton;
	
	
	public void SearchFunctionality() {
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(searchBox).click().sendKeys(searchBox, "Sql");
		seriesOfActions.perform();

		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		
		List<WebElement> search = driver.findElements(By.id("resultStats"));
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
	
	
	@SuppressWarnings("deprecation")
	public void SaveAssignmentDetailsWithoutDetails()
	{
		if (ValidateCanUserAddNewAssignment() == "success")
		{
			assignmentDetailsSaveButton.click();
			
			Alert alertDialog = driver.switchTo().alert();
			String alertText = alertDialog.getText();
			
			Assert.assertEquals("Name is required", alertText);
		}
		
	}
	
	public void SaveAssignmentDetailsWithValidDetails()
	{
		if (ValidateCanUserAddNewAssignment() == "success")
		{
			assignmentDetailsName.sendKeys("Aarti");
			assignmentDetailsDescription.sendKeys("SDET");
			assignmentDetailsGrade.sendKeys("Major");
			assignmentDetailsDuedate.sendKeys("01/01/2023");
			
			assignmentDetailsSaveButton.click();
			
			Alert alertDialog = driver.switchTo().alert();
			String alertText = alertDialog.getText();
			
			Assert.assertEquals("New Assignment successfully added", alertText);
		}
		
	}
	
	public void AssignmentDetailsCancel()
	{
		if (ValidateCanUserAddNewAssignment() == "success")
		{
			assignmentDetailsName.sendKeys("Aarti");
			assignmentDetailsDescription.sendKeys("SDET");
			assignmentDetailsGrade.sendKeys("Major");
			assignmentDetailsDuedate.sendKeys("01/01/2023");
			
			assignmentDetailsCancelButton.click();
			
			driver.switchTo().alert().dismiss(); // this simulates a cancel functionality
		}
	}
	
	public void EditAssignmentDetails(WebElement element)
	{
		editButton.click();
		element.sendKeys("Updated value");
		
		assignmentDetailsSaveButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		
		Assert.assertEquals("Assignment details successfully updated", alertText);
	}
	
	public void DeleteAssignmentDetails(WebElement element)
	{
		deleteButton.click();
				
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		
		Assert.assertEquals("Assignment deleted successfully", alertText);
	}
	
	public void SaveGoogleForms_WithoutMandatoryFields(WebElement element)
	{
		element.click();
		
		driver.navigate(); //now we are on google forms
		
		assignmentGoogleFormSubmitButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		
		Assert.assertEquals("Must enter the mandatory fields", alertText);
		
	}
	
	@SuppressWarnings("deprecation")
	public void SaveGoogleForms_WithMandatoryFields(WebElement element)
	{
		element.click();
		
		driver.navigate(); //now we are on google forms
		
		assignmentGoogleFormName.sendKeys("Aarti sdet");
		assignmentGoogleFormAnimal.sendKeys("horse");
		assignmentGoogleFormColor.sendKeys("Black");
		
		assignmentGoogleFormSubmitButton.click();
		
		Alert alertDialog = driver.switchTo().alert();
		String alertText = alertDialog.getText();
		
		Assert.assertEquals("Google form updated successfully", alertText);
		
	}
}
