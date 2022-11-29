package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Batchpagesreeja {
public WebDriver driver;
	
	public Batchpagesreeja(WebDriver edgedriver) {
		driver = edgedriver;
		PageFactory.initElements(edgedriver,this);
	}
    @FindBy(id = "Manage Batch")
    WebElement txtTitle;
    
    public void verifyTitle() {
    	txtTitle.isDisplayed();
    	System.out.println("Title is displayed: " +txtTitle);
    }
    
    @FindBy(id ="add-new-batch")
    WebElement btnAddBatch;
    
    public void addNewBatch() {
    	btnAddBatch.click();
    }
    
    @FindBy(xpath = "//div[@value='Edit']")
    WebElement btnEdit;	

   public void Edit() {
	   btnEdit.click();
   }
   @FindBy(id = "Batch Details")
   WebElement txtHeader;
   
   public void verifyHeader() {
   	txtHeader.isDisplayed();
   	System.out.println("Title is displayed: " +txtHeader);
   }
   
   @FindBy(id = "Name")
   WebElement txtName;
   
   public void enterName(String name) {
	  txtName.sendKeys(name); 
   }
   @FindBy(id = "Save")
   WebElement save;
   
   public void clickSave() {
	   save.click();
   }
   @FindBy(xpath = "//div[@class = 'alert-alert']")   
	 WebElement message; 
   
   public void readMsg() {
	   message.getText();
	   System.out.println("Current msg: " + message);
   }
   @FindBy(id = "Description")
   WebElement txtDescription;
   
   public void enterDescription(String description) {
	  txtDescription.sendKeys(description); 
   }
   
   
   public void ddselect() {
   Select select = new Select(driver.findElement(By.className("select-program")));
        select.getFirstSelectedOption().click();
	
   }
   @FindBy(className = "radio-status[1]")
   WebElement radioActive;
   @FindBy(className = "radio-status[2]")
   WebElement radioInactive;
   
   public void Status() {
	  radioActive.click(); 
   }
   @FindBy(id = "No of classes")
   WebElement txtClasses;
   
   public void enterNoOfClasses(String number) {
	  txtClasses.sendKeys("10"); 
   }
   
   @FindBy(id = "cancel")
   WebElement btnCancel;
   
   public void Cancel() {
	   btnCancel.click();
	   
   }
   
   
   @FindBy(id = "search")
   WebElement btnSearch;
   
   public void Search() {
	   btnSearch.sendKeys("SEDT test");
	   
   }
   
   @FindBy(className = "edited -detailes")
   WebElement txtDisplay;
   
   public void Display() {
	  txtDisplay.isDisplayed();
	 System.out.println("Details Updated displayed");  
   }
   @FindBy(xpath ="//div[@class='alert alert-primary]")
   WebElement alertMsg;
   public void Alert() {
	   alertMsg.isDisplayed();
	   System.out.println("Alert Msg:" + alertMsg);
   }
  
}