package com.revature.steps;

import com.revature.TestMain;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlanetCreateSteps {

    //Background
    @And("the user creates a planet")
    public void the_user_creates_a_planet() {
        TestMain.planetCreate.selectPlanet();
    }

    // Operates as both Happy and Sad Path. (Variable Input)
    @When("the user inputs a name {string}")
    public void the_user_inputs_a_valid_name(String string) {
        TestMain.planetCreate.insertPlanetName(string);
    }

    @When("the user inputs a file type {string}")
    public void the_user_inputs_a_valid_file_type(String string) {
        TestMain.planetCreate.uploadPlanetImg(string);
    }

    @When("the user submits the planet")
    public void the_user_submits_the_planet(){
        TestMain.planetCreate.submitPlanet();
    }

    @Then("the user is redirected to the home page")
    public void the_user_is_redirected_to_the_home_page() {
        WebDriverWait wait = new WebDriverWait(TestMain.driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.titleIs("Home"));
        Assert.assertEquals("Home", TestMain.driver.getTitle());
    }

    @Then("the data reflected has been refreshed to include the newly added planet")
    public void the_data_reflected_has_been_refreshed_to_include_the_newly_added_planet() {
        Assert.assertEquals(5, TestMain.universal.getNumberOfCelestialRows(5));
    }

}
