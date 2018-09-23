package stepDefinations;

import mainAction.MainActionALL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	public String UserUrlStepDef;
	@Given("^LoadProperties \"(.*?)\"$")
	public void loadproperties(String UserUrl) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DefaultProperties loadDefaultData = new DefaultProperties();
		
		if (UserUrl == "") {
			UserUrlStepDef = loadDefaultData.defaultUrl();
		}else {
			UserUrlStepDef = UserUrl;
		}

		
	}

	@When("^ExecuteMainAll$")
	public void executemainall() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		MainActionALL EnterVlaues = new MainActionALL();
		
		EnterVlaues.main();
	}

	@Then("^ApplicationStatus$")
	public void applicationstatus() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   /// throw new PendingException();
	}
}
