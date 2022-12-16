package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class PayMethodSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
		

	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.paymentPage().addMethodPayment);
	  logger.info("user clicked on add payment method");
	  
	}
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>>passCardData=dataTable.asMaps(String.class,String.class);
		sendText(factory.paymentPage().cardNumField,passCardData.get(0).get("cardNumber"));
		sendText(factory.paymentPage().nameOnCardField,passCardData.get(0).get("nameOnCard"));
		selectByVisibleText(factory.paymentPage().yearField,passCardData.get(0).get("expirationYear"));
		selectByVisibleText(factory.paymentPage().monthField,passCardData.get(0).get("expirationMonth"));
		sendText(factory.paymentPage().securityCodeField,passCardData.get(0).get("securityCode"));
		logger.info("payment method information added");
	}
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.paymentPage().addCardBttn);
		logger.info("user clicked on add your card button");
	   
	}
	@Then("a message should be displayed 'Payment Method added sucessfully'")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.paymentPage().payMethodAddedMessage);
		Assert.assertTrue(isElementDisplayed(factory.paymentPage().payMethodAddedMessage));
	   logger.info("Payent Method Added Successfully");
	} 
	
	
	
}
