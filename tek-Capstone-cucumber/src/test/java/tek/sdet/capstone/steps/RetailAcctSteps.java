package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;


public class RetailAcctSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.updatePage().acctBttn);
		logger.info("user clicked on account option");
	    
	}
	
	@When("User update Name {string} Phone {string}")
	public void userUpdateNamePhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.updatePage().nameField);
		sendText(factory.updatePage().nameField,nameValue);
		clearTextUsingSendKeys(factory.updatePage().phoneField);
		sendText(factory.updatePage().phoneField,phoneValue);
		logger.info("user inserted name and phone values");
	   
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.updatePage().updateButton);
		logger.info("user clicked on update button");
	 
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.updatePage().personalInformationUpdteMsg);
	   Assert.assertTrue(isElementDisplayed(factory.updatePage().personalInformationUpdteMsg));
	   logger.info("user updated profile information successully");
	}
	
	
	
	

}
