package com.revature.steps;

import com.revature.TestMain;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationSteps {

    // Background
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        TestMain.registration.goToLoginPage();
        Assert.assertEquals("Planetarium Login", TestMain.driver.getTitle());
    }

    @And("the user clicks the register link")
    public void the_user_clicks_the_register_link() {
        TestMain.registration.clickRegisterLink();
        Assert.assertEquals("Account Creation", TestMain.driver.getTitle());
    }

    // Happy Path
    @When("the user provides a valid username")
    public void the_user_provides_a_valid_username() {
        System.out.println("Running inputting valid user");
    }

    @When("the user provides a valid password")
    public void the_user_provides_a_valid_password() {
        System.out.println("Running inputting valid pass");
    }

    @When("the user submits the credentials")
    public void the_user_submits_the_credentials() {
        System.out.println("Submitting info");
    }


    // Universal Alert
    @Then("the user should get a browser alert saying {string}")
    public void the_user_should_get_a_browser_alert_saying(String string) {
        System.out.println("Get Browser Alert: " + string);
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        System.out.println("Redirect to login");
    }

    // Sad Path
    @When("the user provides a username {string}")
    public void the_user_provides_a_username(String string) {
        System.out.println("User Provides a Username: " + string);
    }

    @When("the user provides a password {string}")
    public void the_user_provides_a_password(String string) {
        System.out.println("User Provides a password: " + string);
    }

    @Then("the user should be redirected to the register page")
    public void the_user_should_be_redirected_to_the_register_page() {
        System.out.println("Redirect to register");
    }

}
