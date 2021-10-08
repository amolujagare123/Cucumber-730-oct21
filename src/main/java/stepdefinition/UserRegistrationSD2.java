package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSD2 {

    @Given("^I am am on entry from$")
    public void i_am_am_on_entry_from() throws Throwable {
        System.out.println("I am am on entry from");
    }

    @When("^I enter (.+) , (.+) , (.+)$")
    public void i_enter_(String name, String email, String number)
            {
                System.out.println("name="+name);
                System.out.println("email="+email);
                System.out.println("number="+number);
            }

    @Then("^user should be added$")
    public void user_should_be_added() throws Throwable {
        System.out.println("user should be added");
    }

    @And("^sumbit the form$")
    public void sumbit_the_form() throws Throwable {
        System.out.println("sumbit the form");
    }
}
