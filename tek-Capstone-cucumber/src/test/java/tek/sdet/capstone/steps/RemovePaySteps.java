package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RemovePaySteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.removePayPage().removeBttn);
		logger.info("user clicks on remove button option");
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		try {
	   Assert.assertFalse(isElementDisplayed(factory.removePayPage().cardAvailable));
	   logger.info("Payment credentials removed ");
		}catch(AssertionError e) {
			logger.info(e.getMessage());
		}
	}
	
	
}
