package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class EditAddressSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.eAddressPage().editAddressOption);
		logger.info("user clicks on edit option");
	
	}
	
	@And("user update new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	 List<Map<String, String>>addressInformation=dataTable.asMaps(String.class, String.class);
	 selectByVisibleText(factory.addressPage().countryField,addressInformation.get(0).get("country"));
	 clearTextUsingSendKeys(factory.eAddressPage().fullNameField);
	 sendText(factory.addressPage().fullNameField,addressInformation.get(0).get("fullName"));
	 clearTextUsingSendKeys(factory.eAddressPage().phoneNumField);
	 sendText(factory.addressPage().phoneNumField,addressInformation.get(0).get("phoneNumber"));
	 clearTextUsingSendKeys(factory.eAddressPage().stAddressField);
	 sendText(factory.addressPage().stAddressField,addressInformation.get(0).get("streetAddress"));
	 clearTextUsingSendKeys(factory.eAddressPage().aptField);
	 sendText(factory.addressPage().aptField,addressInformation.get(0).get("apt"));
	 clearTextUsingSendKeys(factory.eAddressPage().cityNameField);
	 sendText(factory.addressPage().cityNameField,addressInformation.get(0).get("city"));
	 selectByVisibleText(factory.addressPage().stateNameField,addressInformation.get(0).get("state"));
	 clearTextUsingSendKeys(factory.eAddressPage().zipCodeField);
	 sendText(factory.addressPage().zipCodeField,addressInformation.get(0).get("zipCode"));
	 logger.info("user enters address informations");
	}
	 
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.eAddressPage().updateAddressBttn);
		logger.info("user clicks on update your address button");
	 
	}
	
	@Then("the message should be displayed 'Address Updated Successfully'")
	public void addressAddedSuccessfullyMessage() {
		waitTillPresence(factory.eAddressPage().addressUpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.eAddressPage().addressUpdatedSuccessfullyMessage));
		logger.info("address updated successfully");
	}
	

}
