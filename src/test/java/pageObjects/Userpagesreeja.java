package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userpagesreeja {
	public WebDriver driver;
	public Userpagesreeja(WebDriver edgedriver) {
		 driver = edgedriver;
			PageFactory.initElements(edgedriver,this);
		}
	
	@FindBy(className = "LMS-learning-management-system")
	WebElement txtTitle;
	
	public void verifyTitle() {
		txtTitle.isDisplayed();
		System.out.println("Title is displayed: " +txtTitle);
	}
	
	@FindBy(id ="User")
	WebElement tabUser;
	
	public void User() {
		tabUser.click();
	}
	
	@FindBy(id = "Manage-user")
	WebElement txtHeader;
	
	public void verifyHeader() {
		txtHeader.isDisplayed();
		System.out.println("Title is displayed: " +txtHeader);
	}
	@FindBy(xpath = "//div[@class = 'pagination']")
	WebElement btnPaginator;
	
	public void verifyPaginator() {
		btnPaginator.isDisplayed();
		System.out.println("Title displayed is: " + btnPaginator);
	}
		
	List<WebElement> noRows = driver.findElements(By.xpath("//div//tr\""));
	int rowsSize = noRows.size();
	public void numberOfRows() {
		System.out.println("Total Number Of Rows: " + rowsSize);
					
		}
	public void isPaginatorEnabled() {
		if(rowsSize>=5) {
			WebElement nextArrow = driver.findElement(By.xpath("//div//div"));
			nextArrow.isEnabled();
		}
		
		else {
			WebElement nextArrow = driver.findElement(By.xpath("//div//div"));
			nextArrow.isEnabled();
		}
	}
	
	@FindBy(xpath = "//div/tb")
	WebElement dataTable;
	
	public void isTableDisplayed() {
		dataTable.isDisplayed();
		System.out.println("Data Table is displayed");
	}
	
	@FindBy(xpath = "//div//div[@id ='next'" )
	WebElement nextArrow;
	
	public void Arrow() {
		nextArrow.click();
	}
	
	@FindBy(xpath = "//div//div[@id ='previous'" )
	WebElement previousArrow;
	
	public void pArrow() {
		previousArrow.click();
	}
	
	@FindBy(xpath = "//div//div[@id ='first-page double arrow'" )
	WebElement firstPageArrow;
	
	public void takeToFirstPageArrow() {
		firstPageArrow.click();
	}
	
	@FindBy(xpath = "//div//div[@id ='last-page double arrow'" )
	WebElement lastPageArrow;
	
	public void takeToLastPageArrow() {
		lastPageArrow.click();
	}
	
	@FindBy(id = "msg-entry")
	WebElement txtEntryMsg;
	
	public void entriesMsg() {
		txtEntryMsg.isDisplayed();
	}
	
	@FindBy(id = "msg-totalusers")
	WebElement txtUserMsg;
	
	public void totalUserMsg() {
		txtUserMsg.isDisplayed();
	}
	}


