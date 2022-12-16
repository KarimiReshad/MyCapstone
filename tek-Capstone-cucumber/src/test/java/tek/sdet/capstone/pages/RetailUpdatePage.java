package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailUpdatePage extends BaseSetup{
	
	public RetailUpdatePage() {
		PageFactory.initElements(getDriver(), this);

	}

	
	@FindBy(id="accountLink")
	public WebElement acctBttn;
	
	@FindBy(xpath="//input[@id='nameInput']")
	public WebElement nameField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneField;
	
	@FindBy(id="emailInput")
	public WebElement emailField;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdteMsg;
	
	

}
