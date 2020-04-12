package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.facebookHomePage;

public class facebook {

	private facebookHomePage facebookhome = new facebookHomePage();
	@Given("^the user launches the Facebook login page$")
	public void launchFacebook()
	{
		facebookhome.launchURL();
	}
	
	@And("^enter the information and clicks on Signup$")
	public void createFacebookAccount()
	{
		facebookhome.createAccount();
	}
	
}
