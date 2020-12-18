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
public class SecondCase extends Base implements POR{
	
		Base b = new Base();
	
		@Given("^Practise page of User$")
	    public void practise_page_of_user() throws Throwable {
			b.launchURL();
	    }

	    @When("^Enter (.+) in the page$")
	    public void enter_in_the_page(String name) throws Throwable {

			b.ExplicityWait(entertext, 10);
			b.enterText(entertext, name);
			b.Click(radiobtn);
			b.SelectDDropDown(Drpdwn, "Option1");
			String text = b.getText(textget);
			System.out.println(text);
	       
	    }
	    
	    @When("^Incorrect name entering (.+) in the page$")
	    public void incorrect_name_entering_in_the_page(String name) throws Throwable {
	    	b.ExplicityWait(entertext, 10);
			b.enterText(entertext, name);
			b.Click(radiobtn);
			b.SelectDDropDown(Drpdwn, "Option1");
			String text = b.getText(textget);
			System.out.println(text);
	    }

	    @Then("^Successfully entered name$")
	    public void successfully_entered_name() throws Throwable {
	    	b.close();
	    }
	}


