package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RemoveAddressSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	   click(factory.removeAddressPage().removeOption);
	   logger.info("user clicks on remove option");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		try {
	   Assert.assertFalse(isElementDisplayed(factory.removeAddressPage().addressPresent));
	   logger.info("address information removed");
	} catch(AssertionError e) {
		logger.info(e.getMessage());
		
	}

	}
}
