package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSD2 {

    @Given("^I am on login page of billing$")
    public void i_am_on_login_page_of_billing() throws Throwable {
        System.out.println("I am on login page of billing");
    }

    @When("^I enter username and correct password$")
    public void i_enter_username_and_correct_password() throws Throwable {
        System.out.println("I enter username and correct password");
    }

    @Then("^I should land on dashboard$")
    public void i_should_land_on_dashboard() throws Throwable {
        System.out.println("I should land on dashboard");
    }

    @And("^I click on login button of billing page$")
    public void i_click_on_login_button_of_billing_page() throws Throwable {
        System.out.println("I click on login button of billing page");
    }

    @When("^I enter invalid username and password$")
    public void i_enter_invalid_username_and_password() throws Throwable {
        System.out.println("I enter invalid username and password");

    }

    @Then("^I should get an error$")
    public void i_should_get_an_error() throws Throwable {
        System.out.println("I should get an error");
        Assert.assertEquals("this is not the correct error",true,false);
    }
    @Then("^I should get another error$")
    public void i_should_get_another_error() throws Throwable {
        System.out.println("I should get another error");
    }

    @When("^I enter blank username and password$")
    public void i_enter_blank_username_and_password() throws Throwable {
        System.out.println("I enter blank username and password");
    }

   /* @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_something_and_something(String strArg1, String strArg2)
            {

    }*/

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {

        System.out.println("Username="+username);
        System.out.println("password="+password);
    }

}
