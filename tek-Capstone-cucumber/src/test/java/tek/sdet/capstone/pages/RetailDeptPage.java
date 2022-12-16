package tek.sdet.capstone.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailDeptPage extends BaseSetup {
	public RetailDeptPage() {
		PageFactory.initElements(getDriver(),this);
	}
	
	
	@FindBy(id="hamburgerBtn")
	public WebElement allButton;
	
	
    @FindBy(xpath="//span[text()='Electronics']")
    public WebElement electronics;
    
    
    @FindBy(xpath="//span[text()='Computers']")
    public WebElement computer;
    
    @FindBy(xpath="//span[text()='Automative']")
    public WebElement Automative;
    
    @FindBy(xpath="//span[text()='Smart Home']")
    public WebElement smarthome;
    
    
    @FindBy(xpath="//span[text()='Sports']")
    public WebElement Sports;

    @FindBy(xpath="//span[text()='TV & Video']")
    public WebElement tvAndVidio;
    
    @FindBy(xpath="//span[text()='Video Games']")
    public WebElement videoGames;
    
    @FindBy(xpath="//span[text()='Accessories']")
    public WebElement accessories;
    
    @FindBy(xpath="//span[text()='Networking']")
    public WebElement networking;
    
    @FindBy(xpath="//span[text()='Smart Home Lightning']")
    public WebElement smartHomeLighting;
    
    @FindBy(xpath="//span[text()='Plugs and Outlets']")
    public WebElement plugAndOutlets;
    
    @FindBy(xpath="//span[text()='Athletic Clothing']")
    public WebElement athleticClothing;
    
    @FindBy(xpath="//span[text()='Exercise & Fitness']")
    public WebElement exerciseAndFitness;
    
    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
    public WebElement autoPartsAndAccessories;
    
    @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
    public WebElement motorAndPowerports;
    
    // Next Scenario
    
    @FindBy(id="search")
    public WebElement allDeptButton;
    
    @FindBy(xpath="//input[@class='search__input']")
    public WebElement searchField;
    
    @FindBy(xpath="//button[@id='searchBtn']")
    public WebElement searchBttn;
    
    @FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
    public WebElement kasaProduct;
    
    @FindBy(xpath="//select[@class='product__select']")
    public WebElement productQty;
    
    @FindBy(xpath="//button[@id='addToCartBtn']")
    public WebElement addToCartBttn;
    
    @FindBy(xpath="//span[@id='cartQuantity']")
    public WebElement cardItemQty;
    
    //@Next Scenario
    @FindBy(xpath="//p[text()='Cart ']")
    public WebElement cartOption;
    
    @FindBy(id="addPaymentBtn")
    public WebElement addPayment;
    
    @FindBy(xpath="//button[text()='Proceed to Checkout']")
    public WebElement checkOutBttn;
    
    @FindBy(xpath="//button[text()='Place Your Order']")
    public WebElement placeOrderBttn;
    
    @FindBy(id="addAddressBtn") 
    public WebElement newAddressBttn;
    
    @FindBy(xpath="//div[text()='Order Placed Successfully']")
    public WebElement orderPlacedSuccessfullyMessage;
    
    
    
    @FindBy(xpath="//p[@class='products__name']")
    public WebElement apexLink;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}
