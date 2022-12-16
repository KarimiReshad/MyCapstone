package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
 POMFactory factory = new POMFactory();
 

 @When("User click on Orders section")
 public void userClickOnOrdersSection() {
	 click(factory.orderPage().ordersBttn);
	 logger.info("user clicks on orders button");

 }
 @When("User click on first order in list")
 public void userClickOnFirstOrderInList() {
   click(factory.orderPage().firstOrder);
   logger.info("user clicks on the first order");
 }

 @When("User click on Cancel The Order button")
 public void userClickOnCancelTheOrderButton() {
	 click(factory.orderPage().cancelOrderBttn);
	 logger.info("user clicks on cancel the order button");
 }
 
 @When("User select the cancelation Reason {string}")
 public void userSelectTheCancelationReasonBoughtWrongItem(String text) {
 selectByVisibleText(factory.orderPage().cancelReason,text);
 logger.info("user selects the reason for the order cancellation");
 }
 
 @When("User click on Cancel Order button")
 public void userClickOnCancelOrderButton() {
	 click(factory.orderPage().cancelOrder);
	 logger.info("user clicks on cancel order button");
 }
 
 @Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
 public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
   Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrdreHasBeenCancelledMessage));
   logger.info("A message will be displayed, 'your order has been cancelled");
 }
 
 
 // @Next scenario steps
 
 @When("User click on Return Items button")
 public void userClickOnReturnItemsButton() {
	 click(factory.orderPage().returnItem);
	 logger.info("user clicks on return item");
    
 }
 @When("User select the Return Reason {string}")
 public void userSelectTheReturnReason(String reason) {
    selectByVisibleText(factory.orderPage().returnReason, reason);
    logger.info("user selects the reason for the return of the product");
 }
 
 @When("User select the drop off service {string}")
 public void userSelectTheDropOffService(String service) {
	 selectByVisibleText(factory.orderPage().dropOffService, service);
	 logger.info("user selects the drop off service");
 }
 
 @When("User click on Return Order button")
 public void userClickOnReturnOrderButton() {
	 click(factory.orderPage().returnOrderBtn);
	 logger.info("user clicks on return order button");
 }
 
 @Then("a cancelation message should be displayed {string}")
 public void aCancelationMessageShouldBeDisplayed(String string) {
 Assert.assertTrue(isElementDisplayed(factory.orderPage().returnWasSuccessfullMessage));
 logger.info("the message return was successful appears");
 }
 
 //@Next scenario steps
 
 @When("User click on Review button")
 public void userClickOnReviewButton() {
	 click(factory.orderPage().reviewBttn);
	 logger.info("user clicks on review button");
 }
 
 @When("User write Review headline {string} and {string}")
 public void userWriteReviewHeadlineAnd(String headline, String review) {
	 sendText(factory.orderPage().headlineField,headline);
	 sendText(factory.orderPage().reviewField,review);
	 logger.info("user writes the headline and review text");
	 
 }
 @When("User click Add your Review button")
 public void userClickAddYourReviewButton() {
	 click(factory.orderPage().addReviewBttn);
	 logger.info("user clicks on add your review button");
   
 }
 @Then("a review message should be displayed {string}")
 public void aReviewMessageShouldBeDisplayed(String string) {
	 waitTillPresence(factory.orderPage().yourReviwMessage);
    Assert.assertTrue(isElementDisplayed(factory.orderPage().yourReviwMessage));
    logger.info("the message should display, your review was added successfully");
 }
 
 
}
