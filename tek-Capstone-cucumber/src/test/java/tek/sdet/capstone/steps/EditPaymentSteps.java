package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
//import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class EditPaymentSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@And("user click on cardNumber ending {string}")
	public void userClickOnCardNumEnding(String cardEndNumber ) {
		click(factory.editPayPage().selectCardBttn);
		logger.info("user clicks on cardNumber");
		
//		List<WebElement> cards = factory.editPayPage().selectCardBttn;
//		for(WebElement card: cards) {
//			if(card.getText().equals(cardEndNumber))
//				click(card);
//			logger.info(cardEndNumber + " is selected");
//			break;
//		}
	
	}
		
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.editPayPage().editButton);
		logger.info("user clicks on edit button");
	 
	}
	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>>editPaymentData=dataTable.asMaps(String.class,String.class);
		clearTextUsingSendKeys(factory.editPayPage().cardNumField);
		sendText(factory.editPayPage().cardNumField, editPaymentData.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.editPayPage().nameOnCardField);
		sendText(factory.editPayPage().nameOnCardField, editPaymentData.get(0).get("nameOnCard"));
		selectByVisibleText(factory.editPayPage().yearExpField, editPaymentData.get(0).get("expirationYear"));
		selectByVisibleText(factory.editPayPage().monthExpField, editPaymentData.get(0).get("expirationMonth"));
		clearTextUsingSendKeys(factory.editPayPage().securityCodeField);
		sendText(factory.editPayPage().securityCodeField, editPaymentData.get(0).get("securityCode"));
		logger.info("payment method credentials added");

		
	}
	
	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.editPayPage().updateCardButton);
		logger.info("user clicks on update your card button");
	  
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.editPayPage().paymentMethodUpdateMessage));
	   logger.info("payment method updated successfully");
	}
	

}
