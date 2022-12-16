package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class AddAddressSteps extends CommonUtility {
POMFactory factory = new POMFactory();

@And("User click on Add address option")
public void userClickOnAddAddressOption() {
	click(factory.addressPage().addAddressOption);
	logger.info("user clicks on add address option");
    
}
@And("user fill new address form with below information")
public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
 List<Map<String, String>>addressInformation=dataTable.asMaps(String.class, String.class);
 selectByVisibleText(factory.addressPage().countryField,addressInformation.get(0).get("country"));
 sendText(factory.addressPage().fullNameField,addressInformation.get(0).get("fullName"));
 sendText(factory.addressPage().phoneNumField,addressInformation.get(0).get("phoneNumber"));
 sendText(factory.addressPage().stAddressField,addressInformation.get(0).get("streetAddress"));
 sendText(factory.addressPage().aptField,addressInformation.get(0).get("apt"));
 sendText(factory.addressPage().cityNameField,addressInformation.get(0).get("city"));
 selectByVisibleText(factory.addressPage().stateNameField,addressInformation.get(0).get("state"));
 sendText(factory.addressPage().zipCodeField,addressInformation.get(0).get("zipCode"));
 logger.info("user enters address informations");
 
 
} 
@And("User click Add Your Address button")
public void userClickAddYourAddressButton() {
	click(factory.addressPage().AddressBttn);
	logger.info("user clicks on add your address button");
  
}

@Then("the message should be displayed 'Address Added Successfully'")
public void addressAddedSuccessfullyMessage() {
	waitTillPresence(factory.addressPage().addressAddedSuccessfullyMessage);
	Assert.assertTrue(isElementDisplayed(factory.addressPage().addressAddedSuccessfullyMessage));
	logger.info("address added successfully");
	
}





}
