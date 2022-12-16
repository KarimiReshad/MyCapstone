package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailPassUpdatePage extends BaseSetup {
	public RetailPassUpdatePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//input[@name='previousPassword']")
	public WebElement previousPassField;
	
	@FindBy(xpath="//input[@name='newPassword']")
	public WebElement newPassField;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement confirmPassField;
	
	@FindBy(xpath="//button[@id='credentialsSubmitBtn']")
	public WebElement changePassBttn;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement PassUpdatedMsg;
	

}

