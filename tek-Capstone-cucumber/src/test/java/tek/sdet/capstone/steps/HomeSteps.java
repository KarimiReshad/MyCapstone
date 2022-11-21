package tek.sdet.capstone.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	

    @Given("user is on retail website")
    public void userIsOnRetailWebsite() {
    String expectedTitle = "React App";
    String actualTitle = getTitle();
    Assert.assertEquals(expectedTitle, actualTitle);
    logger.info(actualTitle +"is equal to "+ expectedTitle);
    }
	
    @Then("user verify retail page logo is present")
    public void userVerifyRetailLogoIsPresent() {
    Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
    logger.info("logo is present");
    }
	
	
	
}
