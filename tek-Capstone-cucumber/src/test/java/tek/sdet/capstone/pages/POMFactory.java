package tek.sdet.capstone.pages;

import tek.sdet.capstone.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailSignUpPage signUpPage;
	private RetailUpdatePage updatePage;
	private RetailPassUpdatePage passUpdatePage;
	private PaymentMethodPage paymentPage;
	private EditPaymentPage editPayPage;
	private RemovePaymentPage removePayPage;
	private AddingAddressPage addressPage;
	private EditAddressPage eAddressPage;
	private RemoveAddPage removeAddressPage;
	private RetailDeptPage deptPage;
	private RetailOrderPage orderPage;
	
	

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.signUpPage = new RetailSignUpPage();
		this.updatePage = new  RetailUpdatePage();
		this.passUpdatePage = new RetailPassUpdatePage();
		this.paymentPage = new PaymentMethodPage();
		this.editPayPage = new EditPaymentPage();
		this.removePayPage = new RemovePaymentPage();
		this.addressPage = new AddingAddressPage();
		this.eAddressPage = new EditAddressPage();
		this.removeAddressPage = new RemoveAddPage();
		this.deptPage = new RetailDeptPage();
		this.orderPage = new RetailOrderPage();
		
	}

	public RetailHomePage homePage() {
		return this.homePage;
	}

	public RetailSignInPage signInPage() {
		return this.signInPage;
	}

	public RetailSignUpPage signUpPage() {
		return this.signUpPage;
	}
	
	public RetailUpdatePage updatePage() {
		return this.updatePage;
	} 
	
	public RetailPassUpdatePage passUpdatePage() {
		return this.passUpdatePage;
	}
	
	public PaymentMethodPage paymentPage() {
		return this.paymentPage;
	} 
	
	public EditPaymentPage editPayPage() {
		return this.editPayPage;
	}
	
	public RemovePaymentPage removePayPage() {
		return this.removePayPage;
	}
	
	public AddingAddressPage addressPage() {
		return this.addressPage;
	}
	
	public EditAddressPage eAddressPage() {
		return this.eAddressPage;
	}

	public RemoveAddPage removeAddressPage() {
		return this.removeAddressPage; 
	}
	
	public RetailDeptPage deptPage() {
	return this.deptPage; 
	}
	
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
}
