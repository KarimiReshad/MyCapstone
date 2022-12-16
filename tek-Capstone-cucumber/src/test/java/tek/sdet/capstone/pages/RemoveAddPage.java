package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RemoveAddPage extends BaseSetup {
	public RemoveAddPage() {
		PageFactory.initElements(getDriver(),this);
	}
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeOption;
	
	
	@FindBy(xpath="//div[@class='account__address-btn-wrapper']")
	public WebElement addressPresent;
	
	
	
	
}
