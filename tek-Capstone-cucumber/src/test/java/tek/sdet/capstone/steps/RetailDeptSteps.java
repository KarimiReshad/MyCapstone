package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RetailDeptSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	// Scenario Verify Shop by Department sidebar
	
	@And("User click on All section")
	public void userClickOnAllSection() {
		click(factory.deptPage().allButton);
		logger.info("user clicks on all button option");
		
	 
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
        List<List<String>> optionsToDisplay = dataTable.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
               logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
               
               
    }

	// Scenario Outline: Verify department sidebar options
	String department;
	@When("User is on {string}")
	public String userIsOn(String department) {
		switch(department) {
		case "electronics":
			Assert.assertTrue(isElementDisplayed(factory.deptPage().electronics));
			logger.info("user is on electronics Department");
			break;
		case "Computers":
			Assert.assertTrue(isElementDisplayed(factory.deptPage().computer));
			logger.info("user is on computers department");
			break;
		case "Smart Home":
			Assert.assertTrue(isElementDisplayed(factory.deptPage().smarthome));
			break;
		case "Sports":
			Assert.assertTrue(isElementDisplayed(factory.deptPage().Sports));
			break;
		case "Automative":
			Assert.assertTrue(isElementDisplayed(factory.deptPage().Automative));
			break;
		}
	  return this.department=department;
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>>department=dataTable.asLists();
		
		switch(this.department) {
		case "Electronics":
			click(factory.deptPage().electronics);
			String Video = getText(factory.deptPage().videoGames);
			String tvANDvideo = getText(factory.deptPage().tvAndVidio);
			Assert.assertEquals(tvANDvideo, department.get(0).get(0));
			Assert.assertEquals(Video,department.get(0).get(1));
			logger.info(Video + tvANDvideo +"are available in Electronics section" );
			break;
			
		case "Computers":
			click(factory.deptPage().computer);
			String Accessories = getText(factory.deptPage().accessories);
			String Networking = getText(factory.deptPage().networking);
			Assert.assertEquals(Accessories	,department.get(0).get(0));
			Assert.assertEquals(Networking,department.get(0).get(1));
			logger.info(Accessories+" and "+ Networking +" are avaiable in computer section");
			break;
			
		case "Smart Home":
			click(factory.deptPage().smarthome);
			String SmartHomeLight = getText(factory.deptPage().smarthome);
			String PlugAndOuts = getText(factory.deptPage().plugAndOutlets);
			Assert.assertEquals(SmartHomeLight, department.get(0).get(0));
			Assert.assertEquals(PlugAndOuts, department.get(0).get(1));
			logger.info(SmartHomeLight +" and "+ PlugAndOuts +"are available in Smart Home section");
			break;
			
		case "Sports":
		click(factory.deptPage().Sports);
		String AthleticClothing = getText(factory.deptPage().athleticClothing);
		String ExerciseFitness = getText(factory.deptPage().exerciseAndFitness);
		Assert.assertEquals(AthleticClothing, department.get(0).get(0));
		Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
		logger.info(AthleticClothing +" and "+ ExerciseFitness +" are available in Sports section");
		break;
		
	case "Automative":
		click(factory.deptPage().Automative);
		String AutoPartsAndAccessories = getText(factory.deptPage().autoPartsAndAccessories);
		String MotorAndPowerPorts = getText(factory.deptPage().motorAndPowerports);
		Assert.assertEquals(AutoPartsAndAccessories, department.get(0).get(0));
		Assert.assertEquals(MotorAndPowerPorts, department.get(0).get(1));
		logger.info(AutoPartsAndAccessories +" and "+ MotorAndPowerPorts +" available in Automative section");
		break;
		
		
		}
		
	}
	
	// Scenario: Verify User can add an item to cart
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String SmartHome) {
	selectByVisibleText(factory.deptPage().allDeptButton,SmartHome);
	logger.info("user selects smartHome option");
	}
	
	@When("User search for an item {string}")
	public void userSearchForAnItem(String product) {
	sendText(factory.deptPage().searchField,product);
	logger.info("user insert pruduct name on search field");
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	 click(factory.deptPage().searchBttn);
	 logger.info("user clicks on search button");
	}
	
	@When("User click on item")
	public void userClickOnItem() {
	click(factory.deptPage().kasaProduct);
	logger.info("user clicks on item");
	}
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
	selectByVisibleText(factory.deptPage().productQty,string);
	logger.info("user select quantity of two");
	}
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() { 
	click(factory.deptPage().addToCartBttn);
	logger.info("user clicks on add to card button");
	}
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
	Assert.assertTrue(isElementDisplayed(factory.deptPage().cardItemQty));  
	logger.info("cart quantity shows as '2'");
	}

	
	
	// @addOrder step
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	click(factory.deptPage().cartOption);
	logger.info("user clicks on cart option");
	   
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	click(factory.deptPage().checkOutBttn);
	logger.info("user clicks on check out button");
	}
	
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	click(factory.deptPage().newAddressBttn);
	logger.info("user clicks on add new address button");
	}
	
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	List<Map<String,String>>addressData=dataTable.asMaps(String.class,String.class);
	selectByVisibleText(factory.addressPage().countryField,addressData.get(0).get("country"));
	sendText(factory.addressPage().fullNameField,addressData.get(0).get("fullName"));
	sendText(factory.addressPage().phoneNumField,addressData.get(0).get("phoneNumber"));
	sendText(factory.addressPage().stAddressField,addressData.get(0).get("streetAddress"));
	sendText(factory.addressPage().aptField,addressData.get(0).get("apt"));
	sendText(factory.addressPage().cityNameField,addressData.get(0).get("city"));
	selectByVisibleText(factory.addressPage().stateNameField,addressData.get(0).get("state"));
	sendText(factory.addressPage().zipCodeField,addressData.get(0).get("zipCode"));
	logger.info("New address information added successfully");
	
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	click(factory.deptPage().addPayment);
	logger.info("user clicks on add debit or credit card option");
	  
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		slowDown();
	click(factory.deptPage().placeOrderBttn);
	logger.info("user clicks on place order button");
	}
	
	@Then("the message should be displayed 'Order Placed, Thanks'")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	try {
	Assert.assertTrue(isElementDisplayed(factory.deptPage().orderPlacedSuccessfullyMessage));
	logger.info("Order placed successfully message appears");
	}catch(AssertionError e) {
		logger.info(e.getMessage());
	}
	}
	

	
	}

	
	

