package Banana_StepDefinition;

import Banana_PageAction.Banana_HomePageAction;
import Banana_PageAction.Banana_LoginPageAction;
import Banana_PageAction.Banana_SearchPageAction;
import Banana_Utility.Banana_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Banana_Login extends Banana_Base {
	
	Banana_HomePageAction banana_HomePageAction = new Banana_HomePageAction();
	Banana_SearchPageAction banana_SearchPageAction = new Banana_SearchPageAction();
	Banana_LoginPageAction banana_LoginPageAction = new Banana_LoginPageAction(); 

	@Given("^open <\"([^\"]*)\"> Ban$")
	public void open_Ban(String URL) throws Throwable {
		BanLaunchURL(URL);
	}

	@Then("^click sign in ban$")
	public void click_sign_in_ban() throws Throwable {
		banana_HomePageAction.clicksigninban();  
	}

	@Then("^click create account ban$")
	public void click_create_account_ban() throws Throwable {
		banana_SearchPageAction.clickcreateaccountban();
	}

	@Then("^enter invalid email firstname lastname phone number enter inv password$")
	public void enter_invalid_email_firstname_lastname_phone_number_enter_inv_password() throws Throwable {
		banana_LoginPageAction.enterinvalidemailfirstnamelastnamephonenumberenterinvpassword(); 
	}

	@Then("^click create account$")
	public void click_create_account() throws Throwable {
		banana_LoginPageAction.clickcreateaccount();  
	}

	@Then("^Verify user can not create account successfully$")
	public void verify_user_can_not_create_account_successfully() throws Throwable {
		banana_LoginPageAction.Verifyusercannotcreateaccountsuccessfully();  
	}


}
