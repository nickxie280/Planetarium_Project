package com.revature.steps;

import com.revature.TestMain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutSteps {

    //Logout Functionality is incorporated into Login Functionality

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        if (TestMain.driver.getTitle().equals("Home")){
            Assert.assertEquals("Home", TestMain.driver.getTitle());
        }else{
            TestMain.login.goToLoginPageToLogin();
            Assert.assertEquals("Planetarium Login", TestMain.driver.getTitle());
            TestMain.login.insertUsername("Batman");
            TestMain.login.insertPassword("Iamthenight1939");
            TestMain.login.loginAttempt();
        }
    }

    @When("the user clicks the logout link")
    public void the_user_clicks_the_logout_link() {
        Assert.assertEquals("Home", TestMain.driver.getTitle());
        TestMain.login.logoutAttempt();
    }

    @Then("the user should be redirected to the login page after logout")
    public void the_user_should_be_redirected_to_the_login_page_to_login() {
        Assert.assertEquals("Planetarium Login", TestMain.driver.getTitle());
    }
}
