package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import objectRepo.POR;
import resources.Base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDenifition extends Base implements POR{
	
		Base b = new Base();
	
	    @Given("^User in Practise page$")
	    public void user_in_practise_page() throws Throwable {
	    	b.launchURL();
	    }

	    @When("^User enter (.+) in the page$")
	    public void user_enter_in_the_page(String name) throws Throwable {
	    	

			b.ExplicityWait(entertext, 10);
			b.enterText(entertext, name);
			b.Click(radiobtn);
			b.SelectDDropDown(Drpdwn, "Option1");
			String text = b.getText(textget);
			System.out.println(text);
	       
	    }

	    @Then("^User name entered successfully$")
	    public void user_name_entered_successfully() throws Throwable {
	    	b.close();
	    }

	}


