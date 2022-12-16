package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class AddingAddressPage extends BaseSetup {
	public AddingAddressPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement addAddressOption;
	
	@FindBy(xpath="//select[@id='countryDropdown']")
	public WebElement countryField;
	
	@FindBy(id="fullNameInput")
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
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement AddressBttn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	
	
	
	
	
	
	
	
	
	
}
