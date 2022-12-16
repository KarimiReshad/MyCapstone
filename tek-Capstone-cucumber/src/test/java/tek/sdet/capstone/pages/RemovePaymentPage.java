package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RemovePaymentPage extends BaseSetup {
	public RemovePaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement removeBttn;
	
	@FindBy(xpath="//p[@class='account__payment__sub-text']")
	public WebElement cardAvailable;
	
	
}
