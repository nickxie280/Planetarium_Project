Feature: Login Feature
  As a user I want to securely access my account so I can interact with the Planetarium in a secure environment

  Background: Login Starting Actions
    Given the user is on the login page

  Scenario: Users can login to an account with valid credentials
    #TODO Insert valid username/password in step implementation
    When the user provides a valid username
    And the user provides a valid password
    And the user submits the credentials
    Then the user should be redirected to the home page

  Scenario Outline: Users can not login to an account with invalid credentials
    When the user provides a "<username>"
    When the user provides a "<password>"
    Then the user should get a browser alert saying "<alert>"
    And the user should be redirected to the register page

  Examples:
    |username   | password  |alert                        |
    |VU1	    |VU1	    |Login Success                |
    |VU1	    |IU1	    |Invalid Credentials Alert    |
    |IU1	    |VU1	    |Invalid Credentials Alert    |
    |IU1	    |IU1	    |Invalid Credentials Alert    |