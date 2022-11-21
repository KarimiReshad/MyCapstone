package tek.sdet.capstone.pages;

import tek.sdet.capstone.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailSignInPage signInPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();

	}

	public RetailHomePage homePage() {
		return this.homePage;

	}

	public RetailSignInPage signInPage() {
		return this.signInPage;
		
	}


}
