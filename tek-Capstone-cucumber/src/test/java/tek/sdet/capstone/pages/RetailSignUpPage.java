package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailSignUpPage extends BaseSetup {
	public RetailSignUpPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="newAccountBtn")
	public WebElement newAccount;
	
	@FindBy(id="nameInput")
	public WebElement nameBox;
	
	@FindBy(id="emailInput")
	public WebElement emailBox;
	
	@FindBy(id="passwordInput")
	public WebElement passwordBox;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordBox;
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	
	
	

}
