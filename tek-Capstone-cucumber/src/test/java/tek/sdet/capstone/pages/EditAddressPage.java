package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class EditAddressPage extends BaseSetup {
	public EditAddressPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editAddressOption;
	
	@FindBy(xpath="//select[@id='countryDropdown']")
	public WebElement countryField;
	
	@FindBy(xpath="//input[@name='fullName']")
	public WebElement fullNameField;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumField;
	
	@FindBy(xpath="//input[@id='streetInput']")
	public WebElement stAddressField;
	
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement aptField;
	
	@FindBy(xpath="//input[@id='cityInput']")
	public WebElement cityNameField;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateNameField;
	
	@FindBy(xpath="//input[@id='zipCodeInput']")
	public WebElement zipCodeField;
	
	@FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddressBttn;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMessage;
	
	
}
