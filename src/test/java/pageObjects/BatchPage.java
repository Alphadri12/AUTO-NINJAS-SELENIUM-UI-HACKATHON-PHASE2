package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchPage {
	
	
	public WebDriver driver;
	public BatchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
					
}
	@FindBy(xpath="//a[contains(text(),'Manage Batch')]")
	WebElement headerTxt;
	
	@FindBy(xpath="//a[contains(text(),'A New Batch')]")
	WebElement batchBtn;
	
	@FindBy(xpath="//a[contains(text(),'In total there are 21 batches')]")
	WebElement footerTxt;
	
	@FindBy(xpath="//a[contains(text(),'Showing 1 to 5 of 21 batches')]")
	WebElement paginatorTxt1;
	
	@FindBy(xpath="//a[contains(text(),'Showing 6 to 10 of 21 batches')]")
	WebElement paginatorTxt2;
	
	@FindBy(xpath="//label[contains(text(),'next button')]")
	WebElement nexttextBtn;
	
	@FindBy(xpath="//label[contains(text(),'previous button')]")
	 WebElement previoustextBtn;
	
	@FindBy(xpath="//label[contains(text(),'last button')]")
	 WebElement lasttextBtn;
	
	@FindBy(xpath="//label[contains(text(),'first button')]")
	 WebElement firsttextBtn;
	
	@FindBy(id="search")
	WebElement textBox;
	
	//@FindBy(xpath="//div[contains(text(),'Ascending')]")
	WebElement ascOrderArrow;
	
	
	@FindBy(xpath="//a[contains(text(),'batchStatus')]")
	WebElement batchStatus;
	
	@FindBy(xpath="//a[contains(text(),'batchNoOfClasses')]")
	WebElement batchClasses;
	
	
	
	public void toChkVisibilityOfHeader() {
		
		headerTxt.isDisplayed();
	}
	
	public void batchBtnClk() {
		
		batchBtn.click();
	}
	public void toChkVisibilityOfFooter() {
		
		footerTxt.isDisplayed();
	}
	public void toChkVisibilityOfPaginator() {
		
		paginatorTxt1.isDisplayed();
		paginatorTxt2.isDisplayed();
	}
	public void nextBtnClk() {
		
		nexttextBtn.click();
		
	}
	public void previousBtnClk() {
		
		previoustextBtn.click();
	}
	public void lastBtnClk() {
		
		lasttextBtn.click();
	}
	public void firstBtnClk() {
		
		firsttextBtn.click();
	}
	public void textBxMsgVisiblity() {
		
		 textBox.isDisplayed();
	}
	public void ascendingOrderClk() {
		
		ascOrderArrow.click();
		
	}
	
	public void batchStatus() {
		
		batchStatus.click();
	}
	
	public void batchClasses() {
		
		batchClasses.click();
	}
	
	
	
	
	
	
	
	
	

}
