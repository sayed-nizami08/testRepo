package stepDefinitions;
import org.junit.Assert;

import core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

public class LoginStepDefinations extends Base {
	
	// Declare LoginPageObject obj
	
	LoginPageObject loginpage;
	
	/**
	 * This method will click on Test Link
	 * @throws Throwable
	 */
	
	@Given("^User is on Tekschool page$")
	public void user_is_on_Tekschool_page() throws Throwable {
		Base.inializeDriver();
		// check for title
		
		loginpage = new LoginPageObject();
		String expectedTitle="TEK School – Knowledge is power";
	
		Assert.assertEquals(loginpage.pageTitle(),expectedTitle);
		
	
		
	}

	@When("^User Click on Test Environment link$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();
	    
	}

	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"TEK SCHOOL");
		
	}

}
