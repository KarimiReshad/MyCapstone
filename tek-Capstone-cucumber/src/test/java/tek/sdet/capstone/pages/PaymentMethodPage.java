package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class PaymentMethodPage extends BaseSetup {
	public PaymentMethodPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement addMethodPayment;
	
	@FindBy(xpath="//input[@name='cardNumber']")
	public WebElement cardNumField;
	
	@FindBy(xpath="//input[@name='nameOnCard']")
	public WebElement nameOnCardField;
	
	@FindBy(id="expirationMonthInput")
	public WebElement monthField;
	
	@FindBy(xpath="//select[@name='expirationYear']")
	public WebElement yearField;
	
	@FindBy(xpath="//input[@name='securityCode']") 
	public WebElement securityCodeField;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement addCardBttn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement payMethodAddedMessage;
	
	

}
