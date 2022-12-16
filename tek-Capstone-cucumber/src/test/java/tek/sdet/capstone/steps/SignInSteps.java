package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";	
	String actualTitle = getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +"is equal to "+ expectedTitle);
	 
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().SignInBtn);
		logger.info("User click on sign in button");

	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
	sendText(factory.signInPage().emailField,email);	
	sendText(factory.signInPage().passwordFeild,password);
	logger.info("user enter "+ email +"and "+ password);
	slowDown();
	   
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	click(factory.signInPage().loginBtn);
	logger.info("user click on login button");
	 
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	logger.info("user is logged in into Account");
		
	   
	}
	
	
	
	
}
