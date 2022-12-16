package tek.sdet.capstone.pages;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class EditPaymentPage extends BaseSetup {
	public EditPaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(xpath="//p[@class='account__payment__sub-text']")
	public WebElement selectCardBttn;
	//public List<WebElement> selectCardBttn;

	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editButton; 
	
	@FindBy(xpath="//input[@name='cardNumber']")
	public WebElement cardNumField;
	
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement nameOnCardField;
	
	@FindBy(xpath="//select[@name='expirationMonth']")
	public WebElement monthExpField;
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement yearExpField;
	
	@FindBy(xpath="//input[@id='securityCodeInput']")
	public WebElement securityCodeField;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement updateCardButton;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdateMessage;
	

}
