package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;
	
	@FindBy(id = "signinLink")
	public WebElement SignInBtn;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordFeild;
	
	@FindBy(xpath="//button[@id='loginBtn']")
	public WebElement loginBtn;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	
}
