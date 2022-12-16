package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class SignUpSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signUpPage().newAccount);
		logger.info("User should be on new account page");
	}
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>>signUpData=data.asMaps(String.class,String.class);
		sendText(factory.signUpPage().nameBox,signUpData.get(0).get("name"));
		sendText(factory.signUpPage().emailBox,signUpData.get(0).get("email"));
		sendText(factory.signUpPage().passwordBox,signUpData.get(0).get("password"));
		sendText(factory.signUpPage().confirmPasswordBox,signUpData.get(0).get("confirmPassword"));
		logger.info("user successfully entered the signUp data");
	   slowDown();
		
	} 
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signUpPage().signUpButton);
		logger.info("user click on sign up button");
	  
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	 Assert.assertTrue(isElementDisplayed(factory.signUpPage().account));
	 logger.info("user is signed up into account");
	}
	
	
	
	

}
