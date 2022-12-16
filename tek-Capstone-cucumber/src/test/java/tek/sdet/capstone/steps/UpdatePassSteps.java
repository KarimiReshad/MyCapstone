package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class UpdatePassSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>>passUpdateData=dataTable.asMaps(String.class,String.class);
		sendText(factory.passUpdatePage().previousPassField,passUpdateData.get(0).get("previousPassword"));
		sendText(factory.passUpdatePage().newPassField,passUpdateData.get(0).get("newPassword"));
		sendText(factory.passUpdatePage().confirmPassField,passUpdateData.get(0).get("confirmPassword"));
		logger.info("Password credentials inserted successfully");
	}
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.passUpdatePage().changePassBttn);
		logger.info("user clicked on change password button");
	   
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void passwordUpdatedSuccessfullyMsg() {
		slowDown();
	   Assert.assertTrue(isElementDisplayed(factory.passUpdatePage().PassUpdatedMsg));
	   logger.info("Password updated successfully");
	} 
	
	
}
