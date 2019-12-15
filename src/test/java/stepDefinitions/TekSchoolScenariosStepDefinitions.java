package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.DBUtilities;
import utilities.Utility;
import core.Base;


public class TekSchoolScenariosStepDefinitions extends Base {
	
	TekSchoolScenariosPageObject tekSchoolScenariosPageObject = new TekSchoolScenariosPageObject();
	
	@When("^User click on myAccount menu on top of the page$")
	public void user_click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();
		//tekSchoolScenariosPageObject.clickOnLogin();  
	}
	
	// replace 'username' and 'password' with (.+)
	@And("^User enter username '(.+)' and password '(.+)' to returning menu$")
	public void user_enter_username_username_and_password_password_to_returning_menu(String userName, String password) throws Throwable {
		tekSchoolScenariosPageObject.enterEmailAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(password);   
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnLoginButton();  
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		Assert.assertEquals(true,tekSchoolScenariosPageObject.verifyLoginToMyAccount()); 
		Utility.screenshot(driver);
	}
	
	@And("User click on login on myAccount menu$")
	public void user_click_on_login_on_myAccount_menu() {
		tekSchoolScenariosPageObject.clickOnLogin();  
	}

	@When("^User Click on myAccount menu on top of the page$")
	public void user_Click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
		tekSchoolScenariosPageObject.clickOnMyAccount();
	    
	}

	@When("^User click on register on myAccount menu$")
	public void user_click_on_register_on_myAccount_menu() throws Throwable {
	  
		tekSchoolScenariosPageObject.clickRegister();
	}

	@When("^User fill register form with below information$")
	public void user_fill_register_form_with_below_information(DataTable personalInfo) throws Throwable {
	  List<List<String>> dataValues = personalInfo.raw();
	  
	  tekSchoolScenariosPageObject.fillFirstName(dataValues.get(0).get(0));
	  tekSchoolScenariosPageObject.fillLastName(dataValues.get(0).get(1));
	  tekSchoolScenariosPageObject.fillEmail(dataValues.get(0).get(2));
	  tekSchoolScenariosPageObject.fillPhone(dataValues.get(0).get(3));
	  tekSchoolScenariosPageObject.enterPassword(dataValues.get(0).get(4));
	  tekSchoolScenariosPageObject.fillPasswordConfirmation(dataValues.get(0).get(4));
	  
	  
	  
	}

	@When("^User click on '(.+)' radio button for Subscribe$")
	public void user_click_on_yes_radio_button_for_Subscribe(String radioButtonValue) throws Throwable {
	    
		tekSchoolScenariosPageObject.subscribeRadioButton(radioButtonValue);
		Utility.screenshot(driver);
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		tekSchoolScenariosPageObject.clickOnContinue();
	}

	@Then("^User should see 'Your Account Has Been Created!'$")
	public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
	    Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(), true);
	    Utility.screenshot(driver); 
	}
	
	@When("^User connects to Database$")
	public void user_connects_to_Database() throws Throwable {
		DBUtilities.setupConnection();
	}
	@When("^User sends query'(.+)'$")
	public void user_sends_query(String query) throws Throwable {
		DBUtilities.runQuery(query);
	}

	@Then("^User verify account is created with email'(.+)'$")
	public void user_verify_account_is_created_with_email(String emailValidation) throws Throwable {
	       
	}

}
