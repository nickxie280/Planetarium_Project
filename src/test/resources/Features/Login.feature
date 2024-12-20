Feature: Login Feature
  As a user I want to securely access my account so I can interact with the Planetarium in a secure environment

  Background: Login Starting Actions
    Given the user is on the login page to login

  Scenario: Users can login to an account with valid credentials
    #TODO Insert valid username/password in step implementation
    When the user provides a valid login username
    And the user provides a valid login password
    And the user submits the login credentials
    Then the user should be redirected to the home page

  Scenario Outline: Users can not login to an account with invalid credentials
    When the user provides an invalid login username "<username>"
    When the user provides an invalid login password "<password>"
    And the user submits the login credentials
    Then the user should get a login browser alert saying "<alert>"
    And the user should be redirected to the login page to login

  Examples:
    |username   | password  |alert                        |
    |VU1	    |IU1	    |Invalid credentials          |
    |IU1	    |VU1	    |Invalid credentials          |
    |IU1	    |IU1	    |Invalid credentials          |