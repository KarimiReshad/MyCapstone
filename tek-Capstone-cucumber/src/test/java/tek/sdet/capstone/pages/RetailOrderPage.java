package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement ordersBttn;
	
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement firstOrder;
	
	@FindBy(xpath="//button[text()='Cancel The Order']")
	public WebElement cancelOrderBttn;
	
	@FindBy(id="reasonInput")
	public WebElement cancelReason;
	
	@FindBy(xpath="//button[@class='order__cancel-submit']")
	public WebElement cancelOrder;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrdreHasBeenCancelledMessage;
	
	@FindBy(id="returnBtn")
	public WebElement returnItem;
	
	@FindBy(id="reasonInput")
	public WebElement returnReason;
	
	@FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement dropOffService;
	
	@FindBy(xpath="//button[@class='order__cancel-submit']")
	public WebElement returnOrderBtn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMessage;
	
	@FindBy(xpath="//button[text()='Review']")
	public WebElement reviewBttn;
	
	@FindBy(xpath="//input[@class='account__input']")
	public WebElement headlineField;
	
	@FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement reviewField;
	
	@FindBy(xpath="//button[text()='Add Your Review']")
	public WebElement addReviewBttn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement yourReviwMessage;
	
	
	
	
	
	
	
	
	
	
	
	
}
